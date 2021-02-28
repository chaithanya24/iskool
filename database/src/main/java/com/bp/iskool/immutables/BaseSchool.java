package com.bp.iskool.immutables;

import javax.annotation.Nullable;

public interface BaseSchool {
    String getUniversityId();
    @Nullable
    String getDomain();
    @Nullable
    String getBillingAccountId();
    @Nullable
    String getZipcode();
    @Nullable
    String getBillingDivisionId();
    @Nullable
    String getBillingSlice();
    @Nullable
    String getPartnerType();
}
