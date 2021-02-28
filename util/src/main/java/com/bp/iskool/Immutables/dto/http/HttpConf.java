package com.bp.iskool.Immutables.dto.http;

import org.immutables.value.Value;

import java.time.Duration;

@Value.Immutable
public interface HttpConf {
    @Value.Parameter
    Duration geConnectionTimeOut();
    @Value.Parameter
    Duration getKeepAliveTimeout();
    @Value.Parameter
    int getMaxConnection();
    @Value.Parameter
    int getRetryCount();
}
