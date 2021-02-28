package com.bp.iskool.immutables;

import org.immutables.value.Value;

import javax.annotation.Nullable;
import java.sql.Timestamp;

@Value.Immutable
public interface PreauthRequest {
    String getSamlId();
    String getDomain();
    String getSamlRequest();
    String getRelayState();
    @Nullable
    Integer getRetryCount();
    @Nullable
    Timestamp getLastUpdated();
}
