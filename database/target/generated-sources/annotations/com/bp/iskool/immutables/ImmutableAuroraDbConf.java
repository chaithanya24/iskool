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
 * Immutable implementation of {@link AuroraDbConf}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuroraDbConf.builder()}.
 */
@Generated(from = "AuroraDbConf", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableAuroraDbConf implements AuroraDbConf {
  private final int maxPoolSize;
  private final boolean isAutoCommit;
  private final long connectionTimeout;
  private final String url;
  private final String user;
  private final String password;
  private final String schema;
  private final String driver;

  private ImmutableAuroraDbConf(
      int maxPoolSize,
      boolean isAutoCommit,
      long connectionTimeout,
      String url,
      String user,
      String password,
      String schema,
      String driver) {
    this.maxPoolSize = maxPoolSize;
    this.isAutoCommit = isAutoCommit;
    this.connectionTimeout = connectionTimeout;
    this.url = url;
    this.user = user;
    this.password = password;
    this.schema = schema;
    this.driver = driver;
  }

  /**
   * @return The value of the {@code maxPoolSize} attribute
   */
  @Override
  public int getMaxPoolSize() {
    return maxPoolSize;
  }

  /**
   * @return The value of the {@code isAutoCommit} attribute
   */
  @Override
  public boolean isAutoCommit() {
    return isAutoCommit;
  }

  /**
   * @return The value of the {@code connectionTimeout} attribute
   */
  @Override
  public long getConnectionTimeout() {
    return connectionTimeout;
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @Override
  public String getUrl() {
    return url;
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @Override
  public String getUser() {
    return user;
  }

  /**
   * @return The value of the {@code password} attribute
   */
  @Override
  public String getPassword() {
    return password;
  }

  /**
   * @return The value of the {@code schema} attribute
   */
  @Override
  public String getSchema() {
    return schema;
  }

  /**
   * @return The value of the {@code driver} attribute
   */
  @Override
  public String getDriver() {
    return driver;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getMaxPoolSize() maxPoolSize} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for maxPoolSize
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withMaxPoolSize(int value) {
    if (this.maxPoolSize == value) return this;
    return new ImmutableAuroraDbConf(
        value,
        this.isAutoCommit,
        this.connectionTimeout,
        this.url,
        this.user,
        this.password,
        this.schema,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#isAutoCommit() isAutoCommit} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for isAutoCommit
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withIsAutoCommit(boolean value) {
    if (this.isAutoCommit == value) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        value,
        this.connectionTimeout,
        this.url,
        this.user,
        this.password,
        this.schema,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getConnectionTimeout() connectionTimeout} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for connectionTimeout
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withConnectionTimeout(long value) {
    if (this.connectionTimeout == value) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        this.isAutoCommit,
        value,
        this.url,
        this.user,
        this.password,
        this.schema,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getUrl() url} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for url
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withUrl(String value) {
    String newValue = Objects.requireNonNull(value, "url");
    if (this.url.equals(newValue)) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        this.isAutoCommit,
        this.connectionTimeout,
        newValue,
        this.user,
        this.password,
        this.schema,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getUser() user} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withUser(String value) {
    String newValue = Objects.requireNonNull(value, "user");
    if (this.user.equals(newValue)) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        this.isAutoCommit,
        this.connectionTimeout,
        this.url,
        newValue,
        this.password,
        this.schema,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getPassword() password} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for password
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withPassword(String value) {
    String newValue = Objects.requireNonNull(value, "password");
    if (this.password.equals(newValue)) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        this.isAutoCommit,
        this.connectionTimeout,
        this.url,
        this.user,
        newValue,
        this.schema,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getSchema() schema} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for schema
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withSchema(String value) {
    String newValue = Objects.requireNonNull(value, "schema");
    if (this.schema.equals(newValue)) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        this.isAutoCommit,
        this.connectionTimeout,
        this.url,
        this.user,
        this.password,
        newValue,
        this.driver);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuroraDbConf#getDriver() driver} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for driver
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuroraDbConf withDriver(String value) {
    String newValue = Objects.requireNonNull(value, "driver");
    if (this.driver.equals(newValue)) return this;
    return new ImmutableAuroraDbConf(
        this.maxPoolSize,
        this.isAutoCommit,
        this.connectionTimeout,
        this.url,
        this.user,
        this.password,
        this.schema,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuroraDbConf} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuroraDbConf
        && equalTo((ImmutableAuroraDbConf) another);
  }

  private boolean equalTo(ImmutableAuroraDbConf another) {
    return maxPoolSize == another.maxPoolSize
        && isAutoCommit == another.isAutoCommit
        && connectionTimeout == another.connectionTimeout
        && url.equals(another.url)
        && user.equals(another.user)
        && password.equals(another.password)
        && schema.equals(another.schema)
        && driver.equals(another.driver);
  }

  /**
   * Computes a hash code from attributes: {@code maxPoolSize}, {@code isAutoCommit}, {@code connectionTimeout}, {@code url}, {@code user}, {@code password}, {@code schema}, {@code driver}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + maxPoolSize;
    h += (h << 5) + Boolean.hashCode(isAutoCommit);
    h += (h << 5) + Long.hashCode(connectionTimeout);
    h += (h << 5) + url.hashCode();
    h += (h << 5) + user.hashCode();
    h += (h << 5) + password.hashCode();
    h += (h << 5) + schema.hashCode();
    h += (h << 5) + driver.hashCode();
    return h;
  }


  /**
   * Prints the immutable value {@code AuroraDbConf} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "AuroraDbConf{"
        + "maxPoolSize=" + maxPoolSize
        + ", isAutoCommit=" + isAutoCommit
        + ", connectionTimeout=" + connectionTimeout
        + ", url=" + url
        + ", user=" + user
        + ", password=" + password
        + ", schema=" + schema
        + ", driver=" + driver
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link AuroraDbConf} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuroraDbConf instance
   */
  public static ImmutableAuroraDbConf copyOf(AuroraDbConf instance) {
    if (instance instanceof ImmutableAuroraDbConf) {
      return (ImmutableAuroraDbConf) instance;
    }
    return ImmutableAuroraDbConf.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAuroraDbConf ImmutableAuroraDbConf}.
   * <pre>
   * ImmutableAuroraDbConf.builder()
   *    .maxPoolSize(int) // required {@link AuroraDbConf#getMaxPoolSize() maxPoolSize}
   *    .isAutoCommit(boolean) // required {@link AuroraDbConf#isAutoCommit() isAutoCommit}
   *    .connectionTimeout(long) // required {@link AuroraDbConf#getConnectionTimeout() connectionTimeout}
   *    .url(String) // required {@link AuroraDbConf#getUrl() url}
   *    .user(String) // required {@link AuroraDbConf#getUser() user}
   *    .password(String) // required {@link AuroraDbConf#getPassword() password}
   *    .schema(String) // required {@link AuroraDbConf#getSchema() schema}
   *    .driver(String) // required {@link AuroraDbConf#getDriver() driver}
   *    .build();
   * </pre>
   * @return A new ImmutableAuroraDbConf builder
   */
  public static ImmutableAuroraDbConf.Builder builder() {
    return new ImmutableAuroraDbConf.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAuroraDbConf ImmutableAuroraDbConf}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuroraDbConf", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_MAX_POOL_SIZE = 0x1L;
    private static final long INIT_BIT_IS_AUTO_COMMIT = 0x2L;
    private static final long INIT_BIT_CONNECTION_TIMEOUT = 0x4L;
    private static final long INIT_BIT_URL = 0x8L;
    private static final long INIT_BIT_USER = 0x10L;
    private static final long INIT_BIT_PASSWORD = 0x20L;
    private static final long INIT_BIT_SCHEMA = 0x40L;
    private static final long INIT_BIT_DRIVER = 0x80L;
    private long initBits = 0xffL;

    private int maxPoolSize;
    private boolean isAutoCommit;
    private long connectionTimeout;
    private @Nullable String url;
    private @Nullable String user;
    private @Nullable String password;
    private @Nullable String schema;
    private @Nullable String driver;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AuroraDbConf} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuroraDbConf instance) {
      Objects.requireNonNull(instance, "instance");
      maxPoolSize(instance.getMaxPoolSize());
      isAutoCommit(instance.isAutoCommit());
      connectionTimeout(instance.getConnectionTimeout());
      url(instance.getUrl());
      user(instance.getUser());
      password(instance.getPassword());
      schema(instance.getSchema());
      driver(instance.getDriver());
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getMaxPoolSize() maxPoolSize} attribute.
     * @param maxPoolSize The value for maxPoolSize 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder maxPoolSize(int maxPoolSize) {
      this.maxPoolSize = maxPoolSize;
      initBits &= ~INIT_BIT_MAX_POOL_SIZE;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#isAutoCommit() isAutoCommit} attribute.
     * @param isAutoCommit The value for isAutoCommit 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder isAutoCommit(boolean isAutoCommit) {
      this.isAutoCommit = isAutoCommit;
      initBits &= ~INIT_BIT_IS_AUTO_COMMIT;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getConnectionTimeout() connectionTimeout} attribute.
     * @param connectionTimeout The value for connectionTimeout 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder connectionTimeout(long connectionTimeout) {
      this.connectionTimeout = connectionTimeout;
      initBits &= ~INIT_BIT_CONNECTION_TIMEOUT;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getUrl() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder url(String url) {
      this.url = Objects.requireNonNull(url, "url");
      initBits &= ~INIT_BIT_URL;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getUser() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder user(String user) {
      this.user = Objects.requireNonNull(user, "user");
      initBits &= ~INIT_BIT_USER;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getPassword() password} attribute.
     * @param password The value for password 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder password(String password) {
      this.password = Objects.requireNonNull(password, "password");
      initBits &= ~INIT_BIT_PASSWORD;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getSchema() schema} attribute.
     * @param schema The value for schema 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder schema(String schema) {
      this.schema = Objects.requireNonNull(schema, "schema");
      initBits &= ~INIT_BIT_SCHEMA;
      return this;
    }

    /**
     * Initializes the value for the {@link AuroraDbConf#getDriver() driver} attribute.
     * @param driver The value for driver 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder driver(String driver) {
      this.driver = Objects.requireNonNull(driver, "driver");
      initBits &= ~INIT_BIT_DRIVER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAuroraDbConf ImmutableAuroraDbConf}.
     * @return An immutable instance of AuroraDbConf
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAuroraDbConf build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuroraDbConf(maxPoolSize, isAutoCommit, connectionTimeout, url, user, password, schema, driver);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_MAX_POOL_SIZE) != 0) attributes.add("maxPoolSize");
      if ((initBits & INIT_BIT_IS_AUTO_COMMIT) != 0) attributes.add("isAutoCommit");
      if ((initBits & INIT_BIT_CONNECTION_TIMEOUT) != 0) attributes.add("connectionTimeout");
      if ((initBits & INIT_BIT_URL) != 0) attributes.add("url");
      if ((initBits & INIT_BIT_USER) != 0) attributes.add("user");
      if ((initBits & INIT_BIT_PASSWORD) != 0) attributes.add("password");
      if ((initBits & INIT_BIT_SCHEMA) != 0) attributes.add("schema");
      if ((initBits & INIT_BIT_DRIVER) != 0) attributes.add("driver");
      return "Cannot build AuroraDbConf, some of required attributes are not set " + attributes;
    }
  }
}
