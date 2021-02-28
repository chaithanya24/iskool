//-no-import-rewrite
package com.bp.iskool.Immutables.dto.http;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClientResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClientResponse.builder()}.
 */
@org.immutables.value.Generated(from = "ClientResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableClientResponse implements com.bp.iskool.Immutables.dto.http.ClientResponse {
  private final int status;
  private final java.lang.String response;
  private final org.apache.http.Header[] headers;

  private ImmutableClientResponse(int status, java.lang.String response, org.apache.http.Header[] headers) {
    this.status = status;
    this.response = response;
    this.headers = headers;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @Override
  public int getStatus() {
    return status;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @Override
  public java.lang.String getResponse() {
    return response;
  }

  /**
   * @return A cloned {@code headers} array
   */
  @Override
  public org.apache.http.Header[] getHeaders() {
    return headers.clone();
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClientResponse#getStatus() status} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClientResponse withStatus(int value) {
    if (this.status == value) return this;
    return new ImmutableClientResponse(value, this.response, this.headers);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClientResponse#getResponse() response} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for response
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClientResponse withResponse(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response.equals(newValue)) return this;
    return new ImmutableClientResponse(this.status, newValue, this.headers);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClientResponse#getHeaders() headers}.
   * The array is cloned before being saved as attribute values.
   * @param elements The non-null elements for headers
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClientResponse withHeaders(org.apache.http.Header... elements) {
    org.apache.http.Header[] newValue = elements.clone();
    return new ImmutableClientResponse(this.status, this.response, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClientResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClientResponse
        && equalTo((ImmutableClientResponse) another);
  }

  private boolean equalTo(ImmutableClientResponse another) {
    return status == another.status
        && response.equals(another.response)
        && java.util.Arrays.equals(headers, another.headers);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code response}, {@code headers}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + status;
    h += (h << 5) + response.hashCode();
    h += (h << 5) + java.util.Arrays.hashCode(headers);
    return h;
  }


  /**
   * Prints the immutable value {@code ClientResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "ClientResponse{"
        + "status=" + status
        + ", response=" + response
        + ", headers=" + java.util.Arrays.toString(headers)
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link ClientResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClientResponse instance
   */
  public static ImmutableClientResponse copyOf(ClientResponse instance) {
    if (instance instanceof ImmutableClientResponse) {
      return (ImmutableClientResponse) instance;
    }
    return ImmutableClientResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableClientResponse ImmutableClientResponse}.
   * <pre>
   * ImmutableClientResponse.builder()
   *    .status(int) // required {@link ClientResponse#getStatus() status}
   *    .response(String) // required {@link ClientResponse#getResponse() response}
   *    .headers(org.apache.http.Header) // required {@link ClientResponse#getHeaders() headers}
   *    .build();
   * </pre>
   * @return A new ImmutableClientResponse builder
   */
  public static ImmutableClientResponse.Builder builder() {
    return new ImmutableClientResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableClientResponse ImmutableClientResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClientResponse", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_STATUS = 0x1L;
    private static final long INIT_BIT_RESPONSE = 0x2L;
    private static final long INIT_BIT_HEADERS = 0x4L;
    private long initBits = 0x7L;

    private int status;
    private java.lang.String response;
    private org.apache.http.Header[] headers;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ClientResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ClientResponse instance) {
      java.util.Objects.requireNonNull(instance, "instance");
      status(instance.getStatus());
      response(instance.getResponse());
      headers(instance.getHeaders());
      return this;
    }

    /**
     * Initializes the value for the {@link ClientResponse#getStatus() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder status(int status) {
      this.status = status;
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ClientResponse#getResponse() response} attribute.
     * @param response The value for response 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder response(java.lang.String response) {
      this.response = java.util.Objects.requireNonNull(response, "response");
      initBits &= ~INIT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the value for the {@link ClientResponse#getHeaders() headers} attribute.
     * @param headers The elements for headers
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder headers(org.apache.http.Header... headers) {
      this.headers = headers.clone();
      initBits &= ~INIT_BIT_HEADERS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableClientResponse ImmutableClientResponse}.
     * @return An immutable instance of ClientResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableClientResponse build() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableClientResponse(status, response, headers);
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_RESPONSE) != 0) attributes.add("response");
      if ((initBits & INIT_BIT_HEADERS) != 0) attributes.add("headers");
      return "Cannot build ClientResponse, some of required attributes are not set " + attributes;
    }
  }
}
