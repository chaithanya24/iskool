package com.bp.iskool.Immutables.dto.http;

import org.apache.http.Header;
import org.immutables.value.Value;

@Value.Immutable
public interface ClientResponse {
    int getStatus();
    String getResponse();
    Header[] getHeaders();
}
