package com.bp.iskool.http;


import com.bp.iskool.Immutables.dto.http.ClientResponse;

import java.net.URI;

public interface GetClient {

    /**
     * @param param parameter
     * @param traceIdHeader trace Id headers
     * @return response of type ClientResponse
     */
    ClientResponse get(String param, String traceIdHeader);

    /**
     * @param uri uri value
     * @param traceIdHeader trace Id headers
     * @return response of type ClientResponse
     */
    ClientResponse get(URI uri, String traceIdHeader);

    /**
     * @return base url cliebt using
     */
    String getBaseUrl();
}
