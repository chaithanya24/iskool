package com.bp.iskool.http;

import com.bp.iskool.Immutables.dto.http.ClientResponse;
import com.bp.iskool.close.HasCloseable;
import com.bp.iskool.logger.HasLogger;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;

import java.time.Clock;

public class PostClientImpl implements HasLogger, PostClient<String>, HasCloseable {

    private final ApacheClient httpClient;
    private final String baseUrl;
    private final String name;
    private final Clock clock;
    private final Logger logger;

    public PostClientImpl(ApacheClient httpClient,
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

    public PostClientImpl(ApacheClient httpClient,
                          String baseUrl,
                          String name,
                          Clock clock) {
        this.httpClient = httpClient;
        this.baseUrl = baseUrl;
        this.name = name;
        this.clock = clock;
        this.logger = getLogger();
    }

    @Override
    public ClientResponse post(String requestBody, String traceIdHeader) {
        Header[] headers = {
                new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json"),
                new BasicHeader(HttpHeaders.ACCEPT, "application/json"),
                new BasicHeader("X-Trace-Id", traceIdHeader)};
        return post(requestBody, headers);
    }

    private ClientResponse post(String requestBody, Header... headers) {
        long current = clock.instant().toEpochMilli();
        HttpPost httpPost = new HttpPost(baseUrl);
        if (headers != null)
            httpPost.setHeaders(headers);
        if (requestBody != null)
            httpPost.setEntity(new StringEntity(requestBody, ContentType.APPLICATION_JSON));
        ClientResponse r;
        try {
            logger.debug("{} request: {} ", name, requestBody);
            r = httpClient.execute(httpPost);
            logResponseTime(current, r);
            logger.debug("{} response: {} ", name, r);
        } catch (RuntimeException exe) {
            throw new RuntimeException(exceptionStr(current), exe);
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
}
