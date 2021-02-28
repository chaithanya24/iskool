package com.bp.iskool.immutables;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PreauthRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePreauthRequest.builder()}.
 */
@Generated(from = "PreauthRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutablePreauthRequest implements PreauthRequest {
  private final String samlId;
  private final String domain;
  private final String samlRequest;
  private final String relayState;
  private final @Nullable Integer retryCount;
  private final @Nullable Timestamp lastUpdated;

  private ImmutablePreauthRequest(
      String samlId,
      String domain,
      String samlRequest,
      String relayState,
      @Nullable Integer retryCount,
      @Nullable Timestamp lastUpdated) {
    this.samlId = samlId;
    this.domain = domain;
    this.samlRequest = samlRequest;
    this.relayState = relayState;
    this.retryCount = retryCount;
    this.lastUpdated = lastUpdated;
  }

  /**
   * @return The value of the {@code samlId} attribute
   */
  @Override
  public String getSamlId() {
    return samlId;
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @Override
  public String getDomain() {
    return domain;
  }

  /**
   * @return The value of the {@code samlRequest} attribute
   */
  @Override
  public String getSamlRequest() {
    return samlRequest;
  }

  /**
   * @return The value of the {@code relayState} attribute
   */
  @Override
  public String getRelayState() {
    return relayState;
  }

  /**
   * @return The value of the {@code retryCount} attribute
   */
  @Override
  public @Nullable Integer getRetryCount() {
    return retryCount;
  }

  /**
   * @return The value of the {@code lastUpdated} attribute
   */
  @Override
  public @Nullable Timestamp getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PreauthRequest#getSamlId() samlId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for samlId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePreauthRequest withSamlId(String value) {
    String newValue = Objects.requireNonNull(value, "samlId");
    if (this.samlId.equals(newValue)) return this;
    return new ImmutablePreauthRequest(newValue, this.domain, this.samlRequest, this.relayState, this.retryCount, this.lastUpdated);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PreauthRequest#getDomain() domain} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for domain
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePreauthRequest withDomain(String value) {
    String newValue = Objects.requireNonNull(value, "domain");
    if (this.domain.equals(newValue)) return this;
    return new ImmutablePreauthRequest(this.samlId, newValue, this.samlRequest, this.relayState, this.retryCount, this.lastUpdated);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PreauthRequest#getSamlRequest() samlRequest} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for samlRequest
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePreauthRequest withSamlRequest(String value) {
    String newValue = Objects.requireNonNull(value, "samlRequest");
    if (this.samlRequest.equals(newValue)) return this;
    return new ImmutablePreauthRequest(this.samlId, this.domain, newValue, this.relayState, this.retryCount, this.lastUpdated);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PreauthRequest#getRelayState() relayState} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for relayState
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePreauthRequest withRelayState(String value) {
    String newValue = Objects.requireNonNull(value, "relayState");
    if (this.relayState.equals(newValue)) return this;
    return new ImmutablePreauthRequest(this.samlId, this.domain, this.samlRequest, newValue, this.retryCount, this.lastUpdated);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PreauthRequest#getRetryCount() retryCount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for retryCount (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePreauthRequest withRetryCount(@Nullable Integer value) {
    if (Objects.equals(this.retryCount, value)) return this;
    return new ImmutablePreauthRequest(this.samlId, this.domain, this.samlRequest, this.relayState, value, this.lastUpdated);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PreauthRequest#getLastUpdated() lastUpdated} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lastUpdated (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePreauthRequest withLastUpdated(@Nullable Timestamp value) {
    if (this.lastUpdated == value) return this;
    return new ImmutablePreauthRequest(this.samlId, this.domain, this.samlRequest, this.relayState, this.retryCount, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePreauthRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePreauthRequest
        && equalTo((ImmutablePreauthRequest) another);
  }

  private boolean equalTo(ImmutablePreauthRequest another) {
    return samlId.equals(another.samlId)
        && domain.equals(another.domain)
        && samlRequest.equals(another.samlRequest)
        && relayState.equals(another.relayState)
        && Objects.equals(retryCount, another.retryCount)
        && Objects.equals(lastUpdated, another.lastUpdated);
  }

  /**
   * Computes a hash code from attributes: {@code samlId}, {@code domain}, {@code samlRequest}, {@code relayState}, {@code retryCount}, {@code lastUpdated}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + samlId.hashCode();
    h += (h << 5) + domain.hashCode();
    h += (h << 5) + samlRequest.hashCode();
    h += (h << 5) + relayState.hashCode();
    h += (h << 5) + Objects.hashCode(retryCount);
    h += (h << 5) + Objects.hashCode(lastUpdated);
    return h;
  }


  /**
   * Prints the immutable value {@code PreauthRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PreauthRequest{"
        + "samlId=" + samlId
        + ", domain=" + domain
        + ", samlRequest=" + samlRequest
        + ", relayState=" + relayState
        + ", retryCount=" + retryCount
        + ", lastUpdated=" + lastUpdated
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link PreauthRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PreauthRequest instance
   */
  public static ImmutablePreauthRequest copyOf(PreauthRequest instance) {
    if (instance instanceof ImmutablePreauthRequest) {
      return (ImmutablePreauthRequest) instance;
    }
    return ImmutablePreauthRequest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePreauthRequest ImmutablePreauthRequest}.
   * <pre>
   * ImmutablePreauthRequest.builder()
   *    .samlId(String) // required {@link PreauthRequest#getSamlId() samlId}
   *    .domain(String) // required {@link PreauthRequest#getDomain() domain}
   *    .samlRequest(String) // required {@link PreauthRequest#getSamlRequest() samlRequest}
   *    .relayState(String) // required {@link PreauthRequest#getRelayState() relayState}
   *    .retryCount(Integer | null) // nullable {@link PreauthRequest#getRetryCount() retryCount}
   *    .lastUpdated(java.sql.Timestamp | null) // nullable {@link PreauthRequest#getLastUpdated() lastUpdated}
   *    .build();
   * </pre>
   * @return A new ImmutablePreauthRequest builder
   */
  public static ImmutablePreauthRequest.Builder builder() {
    return new ImmutablePreauthRequest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePreauthRequest ImmutablePreauthRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PreauthRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SAML_ID = 0x1L;
    private static final long INIT_BIT_DOMAIN = 0x2L;
    private static final long INIT_BIT_SAML_REQUEST = 0x4L;
    private static final long INIT_BIT_RELAY_STATE = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String samlId;
    private @Nullable String domain;
    private @Nullable String samlRequest;
    private @Nullable String relayState;
    private @Nullable Integer retryCount;
    private @Nullable Timestamp lastUpdated;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PreauthRequest} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(PreauthRequest instance) {
      Objects.requireNonNull(instance, "instance");
      samlId(instance.getSamlId());
      domain(instance.getDomain());
      samlRequest(instance.getSamlRequest());
      relayState(instance.getRelayState());
      @Nullable Integer retryCountValue = instance.getRetryCount();
      if (retryCountValue != null) {
        retryCount(retryCountValue);
      }
      @Nullable Timestamp lastUpdatedValue = instance.getLastUpdated();
      if (lastUpdatedValue != null) {
        lastUpdated(lastUpdatedValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link PreauthRequest#getSamlId() samlId} attribute.
     * @param samlId The value for samlId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder samlId(String samlId) {
      this.samlId = Objects.requireNonNull(samlId, "samlId");
      initBits &= ~INIT_BIT_SAML_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link PreauthRequest#getDomain() domain} attribute.
     * @param domain The value for domain 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder domain(String domain) {
      this.domain = Objects.requireNonNull(domain, "domain");
      initBits &= ~INIT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the value for the {@link PreauthRequest#getSamlRequest() samlRequest} attribute.
     * @param samlRequest The value for samlRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder samlRequest(String samlRequest) {
      this.samlRequest = Objects.requireNonNull(samlRequest, "samlRequest");
      initBits &= ~INIT_BIT_SAML_REQUEST;
      return this;
    }

    /**
     * Initializes the value for the {@link PreauthRequest#getRelayState() relayState} attribute.
     * @param relayState The value for relayState 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder relayState(String relayState) {
      this.relayState = Objects.requireNonNull(relayState, "relayState");
      initBits &= ~INIT_BIT_RELAY_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link PreauthRequest#getRetryCount() retryCount} attribute.
     * @param retryCount The value for retryCount (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder retryCount(@Nullable Integer retryCount) {
      this.retryCount = retryCount;
      return this;
    }

    /**
     * Initializes the value for the {@link PreauthRequest#getLastUpdated() lastUpdated} attribute.
     * @param lastUpdated The value for lastUpdated (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lastUpdated(@Nullable Timestamp lastUpdated) {
      this.lastUpdated = lastUpdated;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePreauthRequest ImmutablePreauthRequest}.
     * @return An immutable instance of PreauthRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePreauthRequest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePreauthRequest(samlId, domain, samlRequest, relayState, retryCount, lastUpdated);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_SAML_ID) != 0) attributes.add("samlId");
      if ((initBits & INIT_BIT_DOMAIN) != 0) attributes.add("domain");
      if ((initBits & INIT_BIT_SAML_REQUEST) != 0) attributes.add("samlRequest");
      if ((initBits & INIT_BIT_RELAY_STATE) != 0) attributes.add("relayState");
      return "Cannot build PreauthRequest, some of required attributes are not set " + attributes;
    }
  }
}
