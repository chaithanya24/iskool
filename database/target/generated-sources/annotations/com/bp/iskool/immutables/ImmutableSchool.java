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
 * Immutable implementation of {@link School}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSchool.builder()}.
 */
@Generated(from = "School", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableSchool implements School {
  private final String universityId;
  private final @Nullable String domain;
  private final @Nullable String billingAccountId;
  private final @Nullable String zipcode;
  private final @Nullable String billingDivisionId;
  private final @Nullable String billingSlice;
  private final @Nullable String partnerType;

  private ImmutableSchool(
      String universityId,
      @Nullable String domain,
      @Nullable String billingAccountId,
      @Nullable String zipcode,
      @Nullable String billingDivisionId,
      @Nullable String billingSlice,
      @Nullable String partnerType) {
    this.universityId = universityId;
    this.domain = domain;
    this.billingAccountId = billingAccountId;
    this.zipcode = zipcode;
    this.billingDivisionId = billingDivisionId;
    this.billingSlice = billingSlice;
    this.partnerType = partnerType;
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
   * Copy the current immutable object by setting a value for the {@link School#getUniversityId() universityId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for universityId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withUniversityId(String value) {
    String newValue = Objects.requireNonNull(value, "universityId");
    if (this.universityId.equals(newValue)) return this;
    return new ImmutableSchool(
        newValue,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link School#getDomain() domain} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for domain (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withDomain(@Nullable String value) {
    if (Objects.equals(this.domain, value)) return this;
    return new ImmutableSchool(
        this.universityId,
        value,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link School#getBillingAccountId() billingAccountId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for billingAccountId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withBillingAccountId(@Nullable String value) {
    if (Objects.equals(this.billingAccountId, value)) return this;
    return new ImmutableSchool(
        this.universityId,
        this.domain,
        value,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link School#getZipcode() zipcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for zipcode (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withZipcode(@Nullable String value) {
    if (Objects.equals(this.zipcode, value)) return this;
    return new ImmutableSchool(
        this.universityId,
        this.domain,
        this.billingAccountId,
        value,
        this.billingDivisionId,
        this.billingSlice,
        this.partnerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link School#getBillingDivisionId() billingDivisionId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for billingDivisionId (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withBillingDivisionId(@Nullable String value) {
    if (Objects.equals(this.billingDivisionId, value)) return this;
    return new ImmutableSchool(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        value,
        this.billingSlice,
        this.partnerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link School#getBillingSlice() billingSlice} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for billingSlice (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withBillingSlice(@Nullable String value) {
    if (Objects.equals(this.billingSlice, value)) return this;
    return new ImmutableSchool(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        value,
        this.partnerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link School#getPartnerType() partnerType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for partnerType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSchool withPartnerType(@Nullable String value) {
    if (Objects.equals(this.partnerType, value)) return this;
    return new ImmutableSchool(
        this.universityId,
        this.domain,
        this.billingAccountId,
        this.zipcode,
        this.billingDivisionId,
        this.billingSlice,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSchool} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSchool
        && equalTo((ImmutableSchool) another);
  }

  private boolean equalTo(ImmutableSchool another) {
    return universityId.equals(another.universityId)
        && Objects.equals(domain, another.domain)
        && Objects.equals(billingAccountId, another.billingAccountId)
        && Objects.equals(zipcode, another.zipcode)
        && Objects.equals(billingDivisionId, another.billingDivisionId)
        && Objects.equals(billingSlice, another.billingSlice)
        && Objects.equals(partnerType, another.partnerType);
  }

  /**
   * Computes a hash code from attributes: {@code universityId}, {@code domain}, {@code billingAccountId}, {@code zipcode}, {@code billingDivisionId}, {@code billingSlice}, {@code partnerType}.
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
    return h;
  }


  /**
   * Prints the immutable value {@code School} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "School{"
        + "universityId=" + universityId
        + ", domain=" + domain
        + ", billingAccountId=" + billingAccountId
        + ", zipcode=" + zipcode
        + ", billingDivisionId=" + billingDivisionId
        + ", billingSlice=" + billingSlice
        + ", partnerType=" + partnerType
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link School} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable School instance
   */
  public static ImmutableSchool copyOf(School instance) {
    if (instance instanceof ImmutableSchool) {
      return (ImmutableSchool) instance;
    }
    return ImmutableSchool.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSchool ImmutableSchool}.
   * <pre>
   * ImmutableSchool.builder()
   *    .universityId(String) // required {@link School#getUniversityId() universityId}
   *    .domain(String | null) // nullable {@link School#getDomain() domain}
   *    .billingAccountId(String | null) // nullable {@link School#getBillingAccountId() billingAccountId}
   *    .zipcode(String | null) // nullable {@link School#getZipcode() zipcode}
   *    .billingDivisionId(String | null) // nullable {@link School#getBillingDivisionId() billingDivisionId}
   *    .billingSlice(String | null) // nullable {@link School#getBillingSlice() billingSlice}
   *    .partnerType(String | null) // nullable {@link School#getPartnerType() partnerType}
   *    .build();
   * </pre>
   * @return A new ImmutableSchool builder
   */
  public static ImmutableSchool.Builder builder() {
    return new ImmutableSchool.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSchool ImmutableSchool}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "School", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_UNIVERSITY_ID = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String universityId;
    private @Nullable String domain;
    private @Nullable String billingAccountId;
    private @Nullable String zipcode;
    private @Nullable String billingDivisionId;
    private @Nullable String billingSlice;
    private @Nullable String partnerType;

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code com.bp.iskool.immutables.School} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(School instance) {
      Objects.requireNonNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
     * Initializes the value for the {@link School#getUniversityId() universityId} attribute.
     * @param universityId The value for universityId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder universityId(String universityId) {
      this.universityId = Objects.requireNonNull(universityId, "universityId");
      initBits &= ~INIT_BIT_UNIVERSITY_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link School#getDomain() domain} attribute.
     * @param domain The value for domain (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder domain(@Nullable String domain) {
      this.domain = domain;
      return this;
    }

    /**
     * Initializes the value for the {@link School#getBillingAccountId() billingAccountId} attribute.
     * @param billingAccountId The value for billingAccountId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder billingAccountId(@Nullable String billingAccountId) {
      this.billingAccountId = billingAccountId;
      return this;
    }

    /**
     * Initializes the value for the {@link School#getZipcode() zipcode} attribute.
     * @param zipcode The value for zipcode (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder zipcode(@Nullable String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    /**
     * Initializes the value for the {@link School#getBillingDivisionId() billingDivisionId} attribute.
     * @param billingDivisionId The value for billingDivisionId (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder billingDivisionId(@Nullable String billingDivisionId) {
      this.billingDivisionId = billingDivisionId;
      return this;
    }

    /**
     * Initializes the value for the {@link School#getBillingSlice() billingSlice} attribute.
     * @param billingSlice The value for billingSlice (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder billingSlice(@Nullable String billingSlice) {
      this.billingSlice = billingSlice;
      return this;
    }

    /**
     * Initializes the value for the {@link School#getPartnerType() partnerType} attribute.
     * @param partnerType The value for partnerType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder partnerType(@Nullable String partnerType) {
      this.partnerType = partnerType;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSchool ImmutableSchool}.
     * @return An immutable instance of School
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSchool build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableSchool(universityId, domain, billingAccountId, zipcode, billingDivisionId, billingSlice, partnerType);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_UNIVERSITY_ID) != 0) attributes.add("universityId");
      return "Cannot build School, some of required attributes are not set " + attributes;
    }
  }
}
