package com.bp.iskool.http;

import com.bp.iskool.Immutables.dto.http.ClientResponse;
import com.bp.iskool.Immutables.dto.http.HttpConf;
import com.bp.iskool.Immutables.dto.http.ImmutableClientResponse;
import com.bp.iskool.close.HasCloseable;
import com.bp.iskool.logger.HasLogger;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class ApacheClient implements HasLogger, HasCloseable {

    private final HttpConf conf;
    private final PoolingHttpClientConnectionManager pcm;
    private final CloseableHttpClient client;
    private final Logger logger;

    public ApacheClient(HttpConf conf) {
        this.conf = conf;
        this.logger = getLogger();
        this.pcm = new PoolingHttpClientConnectionManager(getSocketFactory());
        this.client = create();
    }

    public ApacheClient(HttpConf conf,
                        Logger logger) {
        this.conf = conf;
        this.logger = logger;
        this.pcm = new PoolingHttpClientConnectionManager(getSocketFactory());
        this.client = create();
    }

    public ClientResponse execute(HttpRequestBase request) {
        if (client == null)
            throw new IllegalStateException("create client before posting");
        CloseableHttpResponse response = null;
        ClientResponse r;
        try {
            response = client.execute(request);
            r = ImmutableClientResponse
                    .builder()
                    .status(response.getStatusLine().getStatusCode())
                    .response(EntityUtils.toString(response.getEntity()))
                    .headers(response.getAllHeaders())
                    .build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            close(response);
            request.releaseConnection();
            pcm.closeExpiredConnections();
            logger.trace("pcm stats post execution: {}", pcm.getTotalStats());
        }
        return r;
    }

    private CloseableHttpClient create() {
        pcm.setMaxTotal(conf.getMaxConnection());
        pcm.setDefaultMaxPerRoute(conf.getMaxConnection());
        return HttpClients.custom()
                .setDefaultRequestConfig(getClientConfig())
                .setConnectionManager(pcm)
                .setKeepAliveStrategy(new TveKeepAliveStrategy())
                .setSSLSocketFactory(getSSLSocketFactory())
                .setRetryHandler(new TveRetryHandler())
                .build();
    }

    private RequestConfig getClientConfig() {
        int connTime = (int) conf.geConnectionTimeOut().toMillis();
        return RequestConfig.custom()
                .setCookieSpec(CookieSpecs.STANDARD)
                .setConnectionRequestTimeout(connTime)
                .setConnectTimeout(connTime)
                .setSocketTimeout(connTime)
                .build();
    }

    private Registry<ConnectionSocketFactory> getSocketFactory() {
        return RegistryBuilder.<ConnectionSocketFactory>create()
                .register("https", getSSLSocketFactory())
                .register("http", new PlainConnectionSocketFactory())
                .build();
    }

    private SSLConnectionSocketFactory getSSLSocketFactory() {
        TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
        SSLContext sslContext;
        try {
            sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
        } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
            throw new IllegalStateException(e.getMessage());
        }
        return new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
    }

    private class TveKeepAliveStrategy extends DefaultConnectionKeepAliveStrategy {
        @Override
        public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
            long val = super.getKeepAliveDuration(response, context);
            long keepAlive = (val < 0) ? conf.getKeepAliveTimeout().toMillis() : val;
            logger.trace("keep alive timeout: {}", keepAlive);
            return keepAlive;
        }
    }

    private class TveRetryHandler extends DefaultHttpRequestRetryHandler {
        TveRetryHandler() {
            super(conf.getRetryCount(), true, Arrays.asList(
                    SSLException.class,
                    UnknownHostException.class,
                    ConnectException.class));
        }

        @Override
        public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
            boolean retryFlag = super.retryRequest(exception, executionCount, context);
            if (retryFlag)
                logger.trace("retry request for exception message: {}", exception.getMessage());
            return retryFlag;
        }
    }
}
