package com.bp.iskool.http;

import com.bp.iskool.Immutables.dto.http.ClientResponse;

public interface PostClient<T> {

    /**
     * @param requestBody request body of type T
     * @param traceIdHeader trace Id headers
     * @return response of type ClientResponse
     */
    ClientResponse post(T requestBody, String traceIdHeader);

}
