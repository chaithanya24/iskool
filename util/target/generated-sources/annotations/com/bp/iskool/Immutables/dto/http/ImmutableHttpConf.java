//-no-import-rewrite
package com.bp.iskool.Immutables.dto.http;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link HttpConf}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHttpConf.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableHttpConf.of()}.
 */
@org.immutables.value.Generated(from = "HttpConf", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableHttpConf implements com.bp.iskool.Immutables.dto.http.HttpConf {
  private final java.time.Duration geConnectionTimeOut;
  private final java.time.Duration keepAliveTimeout;
  private final int maxConnection;
  private final int retryCount;

  private ImmutableHttpConf(
      java.time.Duration geConnectionTimeOut,
      java.time.Duration keepAliveTimeout,
      int maxConnection,
      int retryCount) {
    this.geConnectionTimeOut = java.util.Objects.requireNonNull(geConnectionTimeOut, "geConnectionTimeOut");
    this.keepAliveTimeout = java.util.Objects.requireNonNull(keepAliveTimeout, "keepAliveTimeout");
    this.maxConnection = maxConnection;
    this.retryCount = retryCount;
  }

  private ImmutableHttpConf(
      ImmutableHttpConf original,
      java.time.Duration geConnectionTimeOut,
      java.time.Duration keepAliveTimeout,
      int maxConnection,
      int retryCount) {
    this.geConnectionTimeOut = geConnectionTimeOut;
    this.keepAliveTimeout = keepAliveTimeout;
    this.maxConnection = maxConnection;
    this.retryCount = retryCount;
  }

  /**
   * @return The value of the {@code geConnectionTimeOut} attribute
   */
  @Override
  public java.time.Duration geConnectionTimeOut() {
    return geConnectionTimeOut;
  }

  /**
   * @return The value of the {@code keepAliveTimeout} attribute
   */
  @Override
  public java.time.Duration getKeepAliveTimeout() {
    return keepAliveTimeout;
  }

  /**
   * @return The value of the {@code maxConnection} attribute
   */
  @Override
  public int getMaxConnection() {
    return maxConnection;
  }

  /**
   * @return The value of the {@code retryCount} attribute
   */
  @Override
  public int getRetryCount() {
    return retryCount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpConf#geConnectionTimeOut() geConnectionTimeOut} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for geConnectionTimeOut
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpConf withGeConnectionTimeOut(java.time.Duration value) {
    if (this.geConnectionTimeOut == value) return this;
    java.time.Duration newValue = java.util.Objects.requireNonNull(value, "geConnectionTimeOut");
    return new ImmutableHttpConf(this, newValue, this.keepAliveTimeout, this.maxConnection, this.retryCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpConf#getKeepAliveTimeout() keepAliveTimeout} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for keepAliveTimeout
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpConf withKeepAliveTimeout(java.time.Duration value) {
    if (this.keepAliveTimeout == value) return this;
    java.time.Duration newValue = java.util.Objects.requireNonNull(value, "keepAliveTimeout");
    return new ImmutableHttpConf(this, this.geConnectionTimeOut, newValue, this.maxConnection, this.retryCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpConf#getMaxConnection() maxConnection} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxConnection
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpConf withMaxConnection(int value) {
    if (this.maxConnection == value) return this;
    return new ImmutableHttpConf(this, this.geConnectionTimeOut, this.keepAliveTimeout, value, this.retryCount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HttpConf#getRetryCount() retryCount} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for retryCount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHttpConf withRetryCount(int value) {
    if (this.retryCount == value) return this;
    return new ImmutableHttpConf(this, this.geConnectionTimeOut, this.keepAliveTimeout, this.maxConnection, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHttpConf} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHttpConf
        && equalTo((ImmutableHttpConf) another);
  }

  private boolean equalTo(ImmutableHttpConf another) {
    return geConnectionTimeOut.equals(another.geConnectionTimeOut)
        && keepAliveTimeout.equals(another.keepAliveTimeout)
        && maxConnection == another.maxConnection
        && retryCount == another.retryCount;
  }

  /**
   * Computes a hash code from attributes: {@code geConnectionTimeOut}, {@code keepAliveTimeout}, {@code maxConnection}, {@code retryCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + geConnectionTimeOut.hashCode();
    h += (h << 5) + keepAliveTimeout.hashCode();
    h += (h << 5) + maxConnection;
    h += (h << 5) + retryCount;
    return h;
  }


  /**
   * Prints the immutable value {@code HttpConf} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "HttpConf{"
        + "geConnectionTimeOut=" + geConnectionTimeOut
        + ", keepAliveTimeout=" + keepAliveTimeout
        + ", maxConnection=" + maxConnection
        + ", retryCount=" + retryCount
        + "}";
  }

  /**
   * Construct a new immutable {@code HttpConf} instance.
   * @param geConnectionTimeOut The value for the {@code geConnectionTimeOut} attribute
   * @param keepAliveTimeout The value for the {@code keepAliveTimeout} attribute
   * @param maxConnection The value for the {@code maxConnection} attribute
   * @param retryCount The value for the {@code retryCount} attribute
   * @return An immutable HttpConf instance
   */
  public static com.bp.iskool.Immutables.dto.http.ImmutableHttpConf of(java.time.Duration geConnectionTimeOut, java.time.Duration keepAliveTimeout, int maxConnection, int retryCount) {
    return new ImmutableHttpConf(geConnectionTimeOut, keepAliveTimeout, maxConnection, retryCount);
  }

  /**
   * Creates an immutable copy of a {@link HttpConf} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HttpConf instance
   */
  public static ImmutableHttpConf copyOf(HttpConf instance) {
    if (instance instanceof ImmutableHttpConf) {
      return (ImmutableHttpConf) instance;
    }
    return ImmutableHttpConf.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHttpConf ImmutableHttpConf}.
   * <pre>
   * ImmutableHttpConf.builder()
   *    .geConnectionTimeOut(java.time.Duration) // required {@link HttpConf#geConnectionTimeOut() geConnectionTimeOut}
   *    .keepAliveTimeout(java.time.Duration) // required {@link HttpConf#getKeepAliveTimeout() keepAliveTimeout}
   *    .maxConnection(int) // required {@link HttpConf#getMaxConnection() maxConnection}
   *    .retryCount(int) // required {@link HttpConf#getRetryCount() retryCount}
   *    .build();
   * </pre>
   * @return A new ImmutableHttpConf builder
   */
  public static ImmutableHttpConf.Builder builder() {
    return new ImmutableHttpConf.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHttpConf ImmutableHttpConf}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "HttpConf", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_GE_CONNECTION_TIME_OUT = 0x1L;
    private static final long INIT_BIT_KEEP_ALIVE_TIMEOUT = 0x2L;
    private static final long INIT_BIT_MAX_CONNECTION = 0x4L;
    private static final long INIT_BIT_RETRY_COUNT = 0x8L;
    private long initBits = 0xfL;

    private java.time.Duration geConnectionTimeOut;
    private java.time.Duration keepAliveTimeout;
    private int maxConnection;
    private int retryCount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HttpConf} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(HttpConf instance) {
      java.util.Objects.requireNonNull(instance, "instance");
      geConnectionTimeOut(instance.geConnectionTimeOut());
      keepAliveTimeout(instance.getKeepAliveTimeout());
      maxConnection(instance.getMaxConnection());
      retryCount(instance.getRetryCount());
      return this;
    }

    /**
     * Initializes the value for the {@link HttpConf#geConnectionTimeOut() geConnectionTimeOut} attribute.
     * @param geConnectionTimeOut The value for geConnectionTimeOut 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder geConnectionTimeOut(java.time.Duration geConnectionTimeOut) {
      this.geConnectionTimeOut = java.util.Objects.requireNonNull(geConnectionTimeOut, "geConnectionTimeOut");
      initBits &= ~INIT_BIT_GE_CONNECTION_TIME_OUT;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpConf#getKeepAliveTimeout() keepAliveTimeout} attribute.
     * @param keepAliveTimeout The value for keepAliveTimeout 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder keepAliveTimeout(java.time.Duration keepAliveTimeout) {
      this.keepAliveTimeout = java.util.Objects.requireNonNull(keepAliveTimeout, "keepAliveTimeout");
      initBits &= ~INIT_BIT_KEEP_ALIVE_TIMEOUT;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpConf#getMaxConnection() maxConnection} attribute.
     * @param maxConnection The value for maxConnection 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxConnection(int maxConnection) {
      this.maxConnection = maxConnection;
      initBits &= ~INIT_BIT_MAX_CONNECTION;
      return this;
    }

    /**
     * Initializes the value for the {@link HttpConf#getRetryCount() retryCount} attribute.
     * @param retryCount The value for retryCount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder retryCount(int retryCount) {
      this.retryCount = retryCount;
      initBits &= ~INIT_BIT_RETRY_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHttpConf ImmutableHttpConf}.
     * @return An immutable instance of HttpConf
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHttpConf build() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHttpConf(null, geConnectionTimeOut, keepAliveTimeout, maxConnection, retryCount);
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if ((initBits & INIT_BIT_GE_CONNECTION_TIME_OUT) != 0) attributes.add("geConnectionTimeOut");
      if ((initBits & INIT_BIT_KEEP_ALIVE_TIMEOUT) != 0) attributes.add("keepAliveTimeout");
      if ((initBits & INIT_BIT_MAX_CONNECTION) != 0) attributes.add("maxConnection");
      if ((initBits & INIT_BIT_RETRY_COUNT) != 0) attributes.add("retryCount");
      return "Cannot build HttpConf, some of required attributes are not set " + attributes;
    }
  }
}
