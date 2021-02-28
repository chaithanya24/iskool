package com.bp.iskool.dao;

import com.bp.iskool.immutables.PreauthRequest;
import com.bp.iskool.immutables.School;
import com.bp.iskool.immutables.SpecuSessionInfo;

import java.util.Optional;

public interface SpecuDao {

    /**
     * @param preauthRequest request consist encoded saml abd relay state details.
     */
    int upsertPreauthRequest(PreauthRequest preauthRequest);

    /**
     * @param samlId - unique authn request Id
     * @return pre auth request consist encoded saml abd relay state details.
     */
    Optional<PreauthRequest> getPreauthRequestBySamlId(String samlId);

    /**
     * Update retry count
     * @param retryCount present retry count
     * @param samlId samlId
     */
    int updateRetryCount(int retryCount, String samlId);


    /**
     * @param school - school details received from whitelist client.
     */
    int upsertSchool(School school);

    /**
     * @param specuSessionInfo - ascendon post details.
     */
    int insertSpecuSession(SpecuSessionInfo specuSessionInfo);

    /**
     *
     * @param samlId unique Id for this student table
     * @param authnToken authn generated session token.
     */
    int updateSpecuSession(String samlId, String authnToken);

    /**
     * @param samlId saml Id
     * @return optional student details
     */
    Optional<SpecuSessionInfo> getSpecuSessionBySamlId(String samlId);

    /**
     * @param sessionId session id related to the student
     * @return optional school details
     */
    Optional<School> getSchoolBySessionId(String sessionId);

}
