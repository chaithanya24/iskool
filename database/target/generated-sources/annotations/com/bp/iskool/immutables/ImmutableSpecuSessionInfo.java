package com.bp.iskool.immutables;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link SpecuSessionInfo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecuSessionInfo.builder()}.
 */
@Generated(from = "SpecuSessionInfo", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableSpecuSessionInfo implements SpecuSessionInfo {
  private final String universityId;
  private final @Nullable String domain;
  private final @Nullable String billingAccountId;
  private final @Nullable String zipcode;
  private final @Nullable String billingDivisionId;
  private final @Nullable String billingSlice;
  private final @Nullable String partnerType;
  private final String samlId;
  private final boolean isOnCampus;
  private final @Nullable String trustedAuthId;
  private final @Nullable String errorCode;
  private final @Nullable String errorReason;
  private final @Nullable String authnToken;

  private ImmutableSpecuSessionInfo(
      String universityId,
      @Nullable String domain,
      @Nullable String billingAccountId,
      @Nullable String zipcode,
      @Nullable String billingDivisionId,
      @Nullable String billingSlice,
      @Nullable String partnerType,
      String samlId,
      boolean isOnCampus,
      @Nullable String trustedAuthId,
      @Nullable String errorCode,
      @Nullable String errorReason,
      @Nullable String authnToken) {
    this.universityId = universityId;
    this.domain = domain;
    this.billingAccountId = billingAccountId;
    this.zipcode = zipcode;
    this.billingDivisionId = billingDivisionId;
    this.billingSlice = billingSlice;
    this.partnerType = partnerType;
    this.samlId = samlId;
    this.isOnCampus = isOnCampus;
    this.trustedAuthId = trustedAuthId;
    this.errorCode = errorCode;
    this.errorReason = errorReason;
    this.authnToken = authnToken;
  }

  /**
   * @return The value of the {@code universityId} attribute
   */
  @Override
  public String getUniversityId() {
    return universityId;
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @Override
  public @Nullable String getDomain() {
    return domain;
  }

  /**
   * @return The value of the {@code billingAccountId} attribute
   */
  @Override
  public @Nullable String getBillingAccountId() {
    return billingAccountId;
  }

  /**
   * @return The value of the {@code zipcode} attribute
   */
  @Override
  public @Nullable String getZipcode() {
    return zipcode;
  }

  /**
   * @return The value of the {@code billingDivisionId} attribute
   */
  @Override
  public @Nullable String getBillingDivisionId() {
    return billingDivisionId;
  }

  /**
   * @return The value of the {@code billingSlice} attribute
   */
  @Override
  public @Nullable String getBillingSlice() {
    return billingSlice;
  }

  /**
   * @return The value of the {@code partnerType} attribute
   */
  @Override
  public @Nullable String getPartnerType() {
    return partnerType;
  }

  /**
   * @return The value of the {@code samlId} attribute
   */
  @Override
  public String getSamlId() {
    return samlId;
  }

  /**
   * @return The value of the {@code isOnCampus} attribute
   */
  @Override
  public boolean isOnCampus() {
    return isOnCampus;
  }

  /**
   * @return The value of the {@code trustedAuthId} attribute
   */
  @Override
  public @Nullable String getTrustedAuthId() {
    return trustedAuthId;
  }

  /**
   * @return The value of the {@code errorCode} attribute
   */
  @Override
  public @Nullable String getErrorCode() {
    return errorCode;
  }

  /**
   * @return The value of the {@code errorReason} attribute
   */
  @Override
  public @Nullable String getErrorReason() {
    return errorReason;
  }

  /**
   * @return The value of the {@code authnToken} attribute
   */
  @Override
  public @Nullable String getAuthnToken() {
    return authnToken;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getUniversityId() universityId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for universityId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withUniversityId(String value) {
    String newValue = Objects.requireNonNull(value, "universityId");
    if (this.universityId.equals(newValue)) return this;
    return new ImmutableSpecuSessionInfo(
        newValue,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getDomain() domain} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for domain (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withDomain(@Nullable String value) {
    if (Objects.equals(this.domain, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        value,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getBillingAccountId() billingAccountId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for billingAccountId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withBillingAccountId(@Nullable String value) {
    if (Objects.equals(this.billingAccountId, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        value,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getZipcode() zipcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for zipcode (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withZipcode(@Nullable String value) {
    if (Objects.equals(this.zipcode, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        value,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getBillingDivisionId() billingDivisionId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for billingDivisionId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withBillingDivisionId(@Nullable String value) {
    if (Objects.equals(this.billingDivisionId, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        value,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getBillingSlice() billingSlice} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for billingSlice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withBillingSlice(@Nullable String value) {
    if (Objects.equals(this.billingSlice, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        value,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getPartnerType() partnerType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partnerType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withPartnerType(@Nullable String value) {
    if (Objects.equals(this.partnerType, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        value,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getSamlId() samlId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for samlId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withSamlId(String value) {
    String newValue = Objects.requireNonNull(value, "samlId");
    if (this.samlId.equals(newValue)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        newValue,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#isOnCampus() isOnCampus} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isOnCampus
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withIsOnCampus(boolean value) {
    if (this.isOnCampus == value) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        value,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getTrustedAuthId() trustedAuthId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for trustedAuthId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withTrustedAuthId(@Nullable String value) {
    if (Objects.equals(this.trustedAuthId, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        value,
        this.errorCode,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getErrorCode() errorCode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorCode (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withErrorCode(@Nullable String value) {
    if (Objects.equals(this.errorCode, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        value,
        this.errorReason,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getErrorReason() errorReason} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorReason (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withErrorReason(@Nullable String value) {
    if (Objects.equals(this.errorReason, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        value,
        this.authnToken);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SpecuSessionInfo#getAuthnToken() authnToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for authnToken (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSpecuSessionInfo withAuthnToken(@Nullable String value) {
    if (Objects.equals(this.authnToken, value)) return this;
    return new ImmutableSpecuSessionInfo(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType,
        this.samlId,
        this.isOnCampus,
        this.trustedAuthId,
        this.errorCode,
        this.errorReason,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecuSessionInfo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecuSessionInfo
        && equalTo((ImmutableSpecuSessionInfo) another);
  }

  private boolean equalTo(ImmutableSpecuSessionInfo another) {
    return universityId.equals(another.universityId)
        && Objects.equals(domain, another.domain)
        && Objects.equals(billingAccountId, another.billingAccountId)
        && Objects.equals(zipcode, another.zipcode)
        && Objects.equals(billingDivisionId, another.billingDivisionId)
        && Objects.equals(billingSlice, another.billingSlice)
        && Objects.equals(partnerType, another.partnerType)
        && samlId.equals(another.samlId)
        && isOnCampus == another.isOnCampus
        && Objects.equals(trustedAuthId, another.trustedAuthId)
        && Objects.equals(errorCode, another.errorCode)
        && Objects.equals(errorReason, another.errorReason)
        && Objects.equals(authnToken, another.authnToken);
  }

  /**
   * Computes a hash code from attributes: {@code universityId}, {@code domain}, {@code billingAccountId}, {@code zipcode}, {@code billingDivisionId}, {@code billingSlice}, {@code partnerType}, {@code samlId}, {@code isOnCampus}, {@code trustedAuthId}, {@code errorCode}, {@code errorReason}, {@code authnToken}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + universityId.hashCode();
    h += (h << 5) + Objects.hashCode(domain);
    h += (h << 5) + Objects.hashCode(billingAccountId);
    h += (h << 5) + Objects.hashCode(zipcode);
    h += (h << 5) + Objects.hashCode(billingDivisionId);
    h += (h << 5) + Objects.hashCode(billingSlice);
    h += (h << 5) + Objects.hashCode(partnerType);
    h += (h << 5) + samlId.hashCode();
    h += (h << 5) + Boolean.hashCode(isOnCampus);
    h += (h << 5) + Objects.hashCode(trustedAuthId);
    h += (h << 5) + Objects.hashCode(errorCode);
    h += (h << 5) + Objects.hashCode(errorReason);
    h += (h << 5) + Objects.hashCode(authnToken);
    return h;
  }


  /**
   * Prints the immutable value {@code SpecuSessionInfo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "SpecuSessionInfo{"
        + "universityId=" + universityId
        + ", domain=" + domain
        + ", billingAccountId=" + billingAccountId
        + ", zipcode=" + zipcode
        + ", billingDivisionId=" + billingDivisionId
        + ", billingSlice=" + billingSlice
        + ", partnerType=" + partnerType
        + ", samlId=" + samlId
        + ", isOnCampus=" + isOnCampus
        + ", trustedAuthId=" + trustedAuthId
        + ", errorCode=" + errorCode
        + ", errorReason=" + errorReason
        + ", authnToken=" + authnToken
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link SpecuSessionInfo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecuSessionInfo instance
   */
  public static ImmutableSpecuSessionInfo copyOf(SpecuSessionInfo instance) {
    if (instance instanceof ImmutableSpecuSessionInfo) {
      return (ImmutableSpecuSessionInfo) instance;
    }
    return ImmutableSpecuSessionInfo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSpecuSessionInfo ImmutableSpecuSessionInfo}.
   * <pre>
   * ImmutableSpecuSessionInfo.builder()
   *    .universityId(String) // required {@link SpecuSessionInfo#getUniversityId() universityId}
   *    .domain(String | null) // nullable {@link SpecuSessionInfo#getDomain() domain}
   *    .billingAccountId(String | null) // nullable {@link SpecuSessionInfo#getBillingAccountId() billingAccountId}
   *    .zipcode(String | null) // nullable {@link SpecuSessionInfo#getZipcode() zipcode}
   *    .billingDivisionId(String | null) // nullable {@link SpecuSessionInfo#getBillingDivisionId() billingDivisionId}
   *    .billingSlice(String | null) // nullable {@link SpecuSessionInfo#getBillingSlice() billingSlice}
   *    .partnerType(String | null) // nullable {@link SpecuSessionInfo#getPartnerType() partnerType}
   *    .samlId(String) // required {@link SpecuSessionInfo#getSamlId() samlId}
   *    .isOnCampus(boolean) // required {@link SpecuSessionInfo#isOnCampus() isOnCampus}
   *    .trustedAuthId(String | null) // nullable {@link SpecuSessionInfo#getTrustedAuthId() trustedAuthId}
   *    .errorCode(String | null) // nullable {@link SpecuSessionInfo#getErrorCode() errorCode}
   *    .errorReason(String | null) // nullable {@link SpecuSessionInfo#getErrorReason() errorReason}
   *    .authnToken(String | null) // nullable {@link SpecuSessionInfo#getAuthnToken() authnToken}
   *    .build();
   * </pre>
   * @return A new ImmutableSpecuSessionInfo builder
   */
  public static ImmutableSpecuSessionInfo.Builder builder() {
    return new ImmutableSpecuSessionInfo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSpecuSessionInfo ImmutableSpecuSessionInfo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SpecuSessionInfo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_UNIVERSITY_ID = 0x1L;
    private static final long INIT_BIT_SAML_ID = 0x2L;
    private static final long INIT_BIT_IS_ON_CAMPUS = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String universityId;
    private @Nullable String domain;
    private @Nullable String billingAccountId;
    private @Nullable String zipcode;
    private @Nullable String billingDivisionId;
    private @Nullable String billingSlice;
    private @Nullable String partnerType;
    private @Nullable String samlId;
    private boolean isOnCampus;
    private @Nullable String trustedAuthId;
    private @Nullable String errorCode;
    private @Nullable String errorReason;
    private @Nullable String authnToken;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.bp.iskool.immutables.SpecuSessionInfo} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SpecuSessionInfo instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code com.bp.iskool.immutables.BaseSchool} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BaseSchool instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof SpecuSessionInfo) {
        SpecuSessionInfo instance = (SpecuSessionInfo) object;
        @Nullable String authnTokenValue = instance.getAuthnToken();
        if (authnTokenValue != null) {
          authnToken(authnTokenValue);
        }
        @Nullable String errorCodeValue = instance.getErrorCode();
        if (errorCodeValue != null) {
          errorCode(errorCodeValue);
        }
        @Nullable String trustedAuthIdValue = instance.getTrustedAuthId();
        if (trustedAuthIdValue != null) {
          trustedAuthId(trustedAuthIdValue);
        }
        isOnCampus(instance.isOnCampus());
        samlId(instance.getSamlId());
        @Nullable String errorReasonValue = instance.getErrorReason();
        if (errorReasonValue != null) {
          errorReason(errorReasonValue);
        }
      }
      if (object instanceof BaseSchool) {
        BaseSchool instance = (BaseSchool) object;
        @Nullable String zipcodeValue = instance.getZipcode();
        if (zipcodeValue != null) {
          zipcode(zipcodeValue);
        }
        universityId(instance.getUniversityId());
        @Nullable String domainValue = instance.getDomain();
        if (domainValue != null) {
          domain(domainValue);
        }
        @Nullable String billingAccountIdValue = instance.getBillingAccountId();
        if (billingAccountIdValue != null) {
          billingAccountId(billingAccountIdValue);
        }
        @Nullable String billingDivisionIdValue = instance.getBillingDivisionId();
        if (billingDivisionIdValue != null) {
          billingDivisionId(billingDivisionIdValue);
        }
        @Nullable String partnerTypeValue = instance.getPartnerType();
        if (partnerTypeValue != null) {
          partnerType(partnerTypeValue);
        }
        @Nullable String billingSliceValue = instance.getBillingSlice();
        if (billingSliceValue != null) {
          billingSlice(billingSliceValue);
        }
      }
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getUniversityId() universityId} attribute.
     * @param universityId The value for universityId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder universityId(String universityId) {
      this.universityId = Objects.requireNonNull(universityId, "universityId");
      initBits &= ~INIT_BIT_UNIVERSITY_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getDomain() domain} attribute.
     * @param domain The value for domain (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder domain(@Nullable String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getBillingAccountId() billingAccountId} attribute.
     * @param billingAccountId The value for billingAccountId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder billingAccountId(@Nullable String billingAccountId) {
      this.billingAccountId = billingAccountId;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getZipcode() zipcode} attribute.
     * @param zipcode The value for zipcode (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder zipcode(@Nullable String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getBillingDivisionId() billingDivisionId} attribute.
     * @param billingDivisionId The value for billingDivisionId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder billingDivisionId(@Nullable String billingDivisionId) {
      this.billingDivisionId = billingDivisionId;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getBillingSlice() billingSlice} attribute.
     * @param billingSlice The value for billingSlice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder billingSlice(@Nullable String billingSlice) {
      this.billingSlice = billingSlice;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getPartnerType() partnerType} attribute.
     * @param partnerType The value for partnerType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partnerType(@Nullable String partnerType) {
      this.partnerType = partnerType;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getSamlId() samlId} attribute.
     * @param samlId The value for samlId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder samlId(String samlId) {
      this.samlId = Objects.requireNonNull(samlId, "samlId");
      initBits &= ~INIT_BIT_SAML_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#isOnCampus() isOnCampus} attribute.
     * @param isOnCampus The value for isOnCampus 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isOnCampus(boolean isOnCampus) {
      this.isOnCampus = isOnCampus;
      initBits &= ~INIT_BIT_IS_ON_CAMPUS;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getTrustedAuthId() trustedAuthId} attribute.
     * @param trustedAuthId The value for trustedAuthId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder trustedAuthId(@Nullable String trustedAuthId) {
      this.trustedAuthId = trustedAuthId;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getErrorCode() errorCode} attribute.
     * @param errorCode The value for errorCode (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorCode(@Nullable String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getErrorReason() errorReason} attribute.
     * @param errorReason The value for errorReason (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorReason(@Nullable String errorReason) {
      this.errorReason = errorReason;
      return this;
    }

    /**
     * Initializes the value for the {@link SpecuSessionInfo#getAuthnToken() authnToken} attribute.
     * @param authnToken The value for authnToken (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder authnToken(@Nullable String authnToken) {
      this.authnToken = authnToken;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSpecuSessionInfo ImmutableSpecuSessionInfo}.
     * @return An immutable instance of SpecuSessionInfo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSpecuSessionInfo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSpecuSessionInfo(
          universityId,
          domain,
          billingAccountId,
          zipcode,
          billingDivisionId,
          billingSlice,
          partnerType,
          samlId,
          isOnCampus,
          trustedAuthId,
          errorCode,
          errorReason,
          authnToken);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_UNIVERSITY_ID) != 0) attributes.add("universityId");
      if ((initBits & INIT_BIT_SAML_ID) != 0) attributes.add("samlId");
      if ((initBits & INIT_BIT_IS_ON_CAMPUS) != 0) attributes.add("isOnCampus");
      return "Cannot build SpecuSessionInfo, some of required attributes are not set " + attributes;
    }
  }
}
