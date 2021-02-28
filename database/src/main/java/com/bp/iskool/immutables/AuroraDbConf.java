package com.bp.iskool.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface AuroraDbConf {
    int getMaxPoolSize();
    boolean isAutoCommit();
    long getConnectionTimeout();
    String getUrl();
    String getUser();
    String getPassword();
    String getSchema();
    String getDriver();
}
