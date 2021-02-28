package com.bp.iskool.dao;

import com.bp.iskool.immutables.*;
import com.bp.iskool.mysql.Prepare;
import com.bp.iskool.mysql.Query;
import com.bp.iskool.mysql.RSConvert;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class SpecuDaoImpl extends Query implements SpecuDao {

    private final Prepare insertPreauthQ;
    private final Prepare selectPreauthQ;
    private final Prepare updateRetryCount;
    private final Prepare upsertSchoolQ;
    private final Prepare insertSpecuSessionQ;
    private final Prepare updateSpecuSessionQ;
    private final Prepare selectSpecuSessionQ;
    private final Prepare selectSchoolQ;
    private final RSConvert<PreauthRequest> preauthConvert;
    private final RSConvert<SpecuSessionInfo> specuSessionConvert;
    private final RSConvert<School> schoolConvert;

    public SpecuDaoImpl(DataSource ds) {
        super(ds);
        this.selectPreauthQ = () -> "select * from specu_pre_authenticate where samlId = ?;";
        this.insertPreauthQ = () -> "insert into specu_pre_authenticate (samlId, domain, samlRequest, relayState, retryCount, lastUpdated)" +
                "values (?, ?, ?, ?, 1, CURRENT_TIMESTAMP) " +
                "ON DUPLICATE KEY UPDATE " +
                "domain = ?, " +
                "samlRequest = ?, " +
                "relayState = ?, " +
                "lastUpdated = CURRENT_TIMESTAMP;";
        this.updateRetryCount = () -> "update specu_pre_authenticate set retryCount = ?, lastUpdated = CURRENT_TIMESTAMP where samlId = ?;";
        this.upsertSchoolQ = () -> "insert into specu_school " +
                "(universityId, domain, billingDivisionId, divisionSliceId, billingAccountId, zipcode, partnerType, lastUpdated) " +
                "values (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP) " +
                "ON DUPLICATE KEY UPDATE " +
                "domain = ?, " +
                "billingDivisionId = ?, " +
                "divisionSliceId = ?, " +
                "billingAccountId = ?, " +
                "zipcode = ?, " +
                "partnerType = ?, " +
                "lastUpdated = CURRENT_TIMESTAMP;";
        this.insertSpecuSessionQ = () -> "insert into specu_session_info (samlId, universityId, isOnCampus, trustedAuthId, errorCode, errorReason, lastUpdated) " +
                "values (?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP);";
        this.updateSpecuSessionQ = () -> "update specu_session_info set authnToken = ?, lastUpdated = CURRENT_TIMESTAMP where samlId = ?;";
        this.selectSpecuSessionQ = () -> "select sc.universityId, sc.domain, sc.billingDivisionId, sc.divisionSliceId, sc.billingAccountId, sc.zipcode, " +
                "sc.partnerType, ss.isOnCampus, ss.trustedAuthId, ss.errorCode, ss.errorReason, ss.samlId " +
                "from specu_school as sc, specu_session_info as ss " +
                "where sc.universityId = ss.universityId " +
                "and ss.samlId = ?;";
        this.selectSchoolQ = () -> "select sc.universityId, sc.domain, sc.billingDivisionId, sc.divisionSliceId, sc.billingAccountId, sc.zipcode, sc.partnerType " +
                " from specu_school as sc, specu_session_info as ss" +
                " where sc.universityId = ss.universityId" +
                " and ss.authnToken = ?;";
        this.preauthConvert = SpecuDaoImpl::toPreauthRequest;
        this.specuSessionConvert = SpecuDaoImpl::toSpecuSession;
        this.schoolConvert = SpecuDaoImpl::toSchool;
    }

    @Override
    public Optional<PreauthRequest> getPreauthRequestBySamlId(String samlId) {
        Connection cn = getConnection();
        return query(cn, selectPreauthQ.prepareQuery(cn, samlId), preauthConvert)
                .stream()
                .findFirst();
    }

    @Override
    public int updateRetryCount(int retryCount, String samlId) {
        Connection cn = getConnection();
        return update(cn, updateRetryCount.prepareQuery(cn, retryCount, samlId));
    }

    @Override
    public int upsertPreauthRequest(PreauthRequest preauthRequest) {
        Connection cn = getConnection();
        return update(cn, insertPreauthQ.prepareQuery(cn,
                preauthRequest.getSamlId(),
                preauthRequest.getDomain(),
                preauthRequest.getSamlRequest(),
                preauthRequest.getRelayState(),
                preauthRequest.getDomain(),
                preauthRequest.getSamlRequest(),
                preauthRequest.getRelayState()));
    }

    @Override
    public int upsertSchool(School school) {
        Connection cn = getConnection();
        return update(cn, upsertSchoolQ.prepareQuery(cn,
                school.getUniversityId(),
                school.getDomain(),
                school.getBillingDivisionId(),
                school.getBillingSlice(),
                school.getBillingAccountId(),
                school.getZipcode(),
                school.getPartnerType(),
                school.getDomain(),
                school.getBillingDivisionId(),
                school.getBillingSlice(),
                school.getBillingAccountId(),
                school.getZipcode(),
                school.getPartnerType()));
    }

    @Override
    public int insertSpecuSession(SpecuSessionInfo specuSessionInfo) {
        Connection cn = getConnection();
        return update(cn, insertSpecuSessionQ.prepareQuery(cn,
                specuSessionInfo.getSamlId(),
                specuSessionInfo.getUniversityId(),
                specuSessionInfo.isOnCampus(),
                specuSessionInfo.getTrustedAuthId(),
                specuSessionInfo.getErrorCode(),
                specuSessionInfo.getErrorReason()));
    }

    @Override
    public int updateSpecuSession(String samlId, String authnToken) {
        Connection cn = getConnection();
        return update(cn, updateSpecuSessionQ.prepareQuery(cn,
                authnToken,
                samlId));
    }

    @Override
    public Optional<SpecuSessionInfo> getSpecuSessionBySamlId(String samlId) {
        Connection cn = getConnection();
        return query(cn, selectSpecuSessionQ.prepareQuery(cn, samlId), specuSessionConvert)
                .stream()
                .findFirst();
    }

    @Override
    public Optional<School> getSchoolBySessionId(String sessionId) {
        Connection cn = getConnection();
        return query(cn, selectSchoolQ.prepareQuery(cn, sessionId), schoolConvert)
                .stream()
                .findFirst();
    }

    private static PreauthRequest toPreauthRequest(ResultSet rs)
            throws SQLException {
        return ImmutablePreauthRequest.builder()
                .samlId(rs.getString("samlId"))
                .domain(rs.getString("domain"))
                .samlRequest(rs.getString("samlRequest"))
                .relayState(rs.getString("relayState"))
                .retryCount(rs.getInt("retryCount"))
                .build();
    }

    private static SpecuSessionInfo toSpecuSession(ResultSet rs)
            throws SQLException {
        return ImmutableSpecuSessionInfo.builder()
                .samlId(rs.getString("samlId"))
                .domain(rs.getString("domain"))
                .universityId(rs.getString("universityId"))
                .isOnCampus(rs.getBoolean("isOnCampus"))
                .trustedAuthId(rs.getString("trustedAuthId"))
                .billingAccountId(rs.getString("billingAccountId"))
                .billingSlice(rs.getString("divisionSliceId"))
                .billingDivisionId(rs.getString("billingDivisionId"))
                .zipcode(rs.getString("zipcode"))
                .partnerType(rs.getString("partnerType"))
                .errorCode(rs.getString("errorCode"))
                .errorReason(rs.getString("errorReason"))
                .build();
    }

    private static School toSchool(ResultSet rs)
            throws SQLException {
        return ImmutableSchool.builder()
                .universityId(rs.getString("universityId"))
                .domain(rs.getString("domain"))
                .billingAccountId(rs.getString("billingAccountId"))
                .billingSlice(rs.getString("divisionSliceId"))
                .billingDivisionId(rs.getString("billingDivisionId"))
                .zipcode(rs.getString("zipcode"))
                .partnerType(rs.getString("partnerType"))
                .build();
    }
}
