package com.bp.iskool.immutables;

import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
public interface SpecuSessionInfo extends BaseSchool{
    String getSamlId();
    boolean isOnCampus();
    @Nullable
    String getTrustedAuthId();
    @Nullable
    String getErrorCode();
    @Nullable
    String getErrorReason();
    @Nullable
    String getAuthnToken();
}
