package com.bp.iskool.http;

import com.bp.iskool.Immutables.dto.http.ClientResponse;
import com.bp.iskool.close.HasCloseable;
import com.bp.iskool.logger.HasLogger;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Clock;

public class GetClientImpl implements GetClient, HasLogger, HasCloseable {
    private final ApacheClient httpClient;
    private final String baseUrl;
    private final String name;
    private final Clock clock;
    private final Logger logger;

    public GetClientImpl(ApacheClient httpClient,
                         String baseUrl,
                         String name,
                         Clock clock) {
        this.httpClient = httpClient;
        this.baseUrl = baseUrl;
        this.name = name;
        this.clock = clock;
        this.logger = getLogger();
    }

    public GetClientImpl(ApacheClient httpClient,
                         String baseUrl,
                         String name,
                         Clock clock,
                         Logger logger) {
        this.httpClient = httpClient;
        this.baseUrl = baseUrl;
        this.name = name;
        this.clock = clock;
        this.logger = logger;
    }

    @Override
    public ClientResponse get(String domain, String traceIdHeader) {
        Header[] headers = {
                new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"),
                new BasicHeader(HttpHeaders.ACCEPT, "application/json"),
                new BasicHeader("X-Trace-Id", traceIdHeader)};
        return get(uri(domain), headers);
    }

    @Override
    public ClientResponse get(URI uri, String traceIdHeader) {
        Header[] headers = {
                new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"),
                new BasicHeader(HttpHeaders.ACCEPT, "application/json"),
                new BasicHeader("X-Trace-Id", traceIdHeader)};
        return get(uri, headers);
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    private ClientResponse get(URI uri, Header... headers) {
        long current = clock.instant().toEpochMilli();
        if (httpClient == null)
            throw new IllegalStateException("create client before posting");
        HttpGet httpGet = new HttpGet(uri);
        // Add Headers
        if (headers != null)
            httpGet.setHeaders(headers);
        // post request body
        ClientResponse r;
        try {
            logger.debug("{} request: {} ", name, uri.getRawPath());
            r = httpClient.execute(httpGet);
            logResponseTime(current, r);
            logger.debug("{} response: {} ", name, r);
        } catch (RuntimeException exc) {
            throw new RuntimeException(exceptionStr(current), exc);
        }
        return r;
    }

    private void logResponseTime(long current, ClientResponse response) {
        logger.info("{} http response status: {} response time: {}", name,
                response.getStatus(),
                clock.instant().toEpochMilli() - current);
    }

    private String exceptionStr(long current) {
        return String.format("exception processing ufam request, url %s, response time %d",
                baseUrl,
                (clock.instant().toEpochMilli() - current));
    }

    private URI uri(String domain) {
        try {
            return new URIBuilder(baseUrl)
                    .setParameter("domain", domain)
                    .build();
        } catch (URISyntaxException e) {
            throw new IllegalStateException("exception building get URL:" + baseUrl, e);
        }
    }
}
