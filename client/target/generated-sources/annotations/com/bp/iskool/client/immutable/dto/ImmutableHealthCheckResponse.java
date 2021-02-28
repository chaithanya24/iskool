package com.bp.iskool.client.immutable.dto;

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
 * Immutable implementation of {@link HealthCheckResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHealthCheckResponse.builder()}.
 */
@Generated(from = "HealthCheckResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
public final class ImmutableHealthCheckResponse
    implements HealthCheckResponse {
  private final String projectName;
  private final String commitId;
  private final String buildVersion;
  private final String configVersion;
  private final String hostName;

  private ImmutableHealthCheckResponse(
      String projectName,
      String commitId,
      String buildVersion,
      String configVersion,
      String hostName) {
    this.projectName = projectName;
    this.commitId = commitId;
    this.buildVersion = buildVersion;
    this.configVersion = configVersion;
    this.hostName = hostName;
  }

  /**
   * @return The value of the {@code projectName} attribute
   */
  @Override
  public String getProjectName() {
    return projectName;
  }

  /**
   * @return The value of the {@code commitId} attribute
   */
  @Override
  public String getCommitId() {
    return commitId;
  }

  /**
   * @return The value of the {@code buildVersion} attribute
   */
  @Override
  public String getBuildVersion() {
    return buildVersion;
  }

  /**
   * @return The value of the {@code configVersion} attribute
   */
  @Override
  public String getConfigVersion() {
    return configVersion;
  }

  /**
   * @return The value of the {@code hostName} attribute
   */
  @Override
  public String getHostName() {
    return hostName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthCheckResponse#getProjectName() projectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for projectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthCheckResponse withProjectName(String value) {
    String newValue = Objects.requireNonNull(value, "projectName");
    if (this.projectName.equals(newValue)) return this;
    return new ImmutableHealthCheckResponse(newValue, this.commitId, this.buildVersion, this.configVersion, this.hostName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthCheckResponse#getCommitId() commitId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for commitId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthCheckResponse withCommitId(String value) {
    String newValue = Objects.requireNonNull(value, "commitId");
    if (this.commitId.equals(newValue)) return this;
    return new ImmutableHealthCheckResponse(this.projectName, newValue, this.buildVersion, this.configVersion, this.hostName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthCheckResponse#getBuildVersion() buildVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for buildVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthCheckResponse withBuildVersion(String value) {
    String newValue = Objects.requireNonNull(value, "buildVersion");
    if (this.buildVersion.equals(newValue)) return this;
    return new ImmutableHealthCheckResponse(this.projectName, this.commitId, newValue, this.configVersion, this.hostName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthCheckResponse#getConfigVersion() configVersion} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for configVersion
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthCheckResponse withConfigVersion(String value) {
    String newValue = Objects.requireNonNull(value, "configVersion");
    if (this.configVersion.equals(newValue)) return this;
    return new ImmutableHealthCheckResponse(this.projectName, this.commitId, this.buildVersion, newValue, this.hostName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link HealthCheckResponse#getHostName() hostName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for hostName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableHealthCheckResponse withHostName(String value) {
    String newValue = Objects.requireNonNull(value, "hostName");
    if (this.hostName.equals(newValue)) return this;
    return new ImmutableHealthCheckResponse(this.projectName, this.commitId, this.buildVersion, this.configVersion, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHealthCheckResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHealthCheckResponse
        && equalTo((ImmutableHealthCheckResponse) another);
  }

  private boolean equalTo(ImmutableHealthCheckResponse another) {
    return projectName.equals(another.projectName)
        && commitId.equals(another.commitId)
        && buildVersion.equals(another.buildVersion)
        && configVersion.equals(another.configVersion)
        && hostName.equals(another.hostName);
  }

  /**
   * Computes a hash code from attributes: {@code projectName}, {@code commitId}, {@code buildVersion}, {@code configVersion}, {@code hostName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + projectName.hashCode();
    h += (h << 5) + commitId.hashCode();
    h += (h << 5) + buildVersion.hashCode();
    h += (h << 5) + configVersion.hashCode();
    h += (h << 5) + hostName.hashCode();
    return h;
  }


  /**
   * Prints the immutable value {@code HealthCheckResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return com.google.common.base.Objects.toStringHelper("HealthCheckResponse")
        .omitNullValues()
        .add("projectName", projectName)
        .add("commitId", commitId)
        .add("buildVersion", buildVersion)
        .add("configVersion", configVersion)
        .add("hostName", hostName)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link HealthCheckResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HealthCheckResponse instance
   */
  public static ImmutableHealthCheckResponse copyOf(HealthCheckResponse instance) {
    if (instance instanceof ImmutableHealthCheckResponse) {
      return (ImmutableHealthCheckResponse) instance;
    }
    return ImmutableHealthCheckResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableHealthCheckResponse ImmutableHealthCheckResponse}.
   * <pre>
   * ImmutableHealthCheckResponse.builder()
   *    .projectName(String) // required {@link HealthCheckResponse#getProjectName() projectName}
   *    .commitId(String) // required {@link HealthCheckResponse#getCommitId() commitId}
   *    .buildVersion(String) // required {@link HealthCheckResponse#getBuildVersion() buildVersion}
   *    .configVersion(String) // required {@link HealthCheckResponse#getConfigVersion() configVersion}
   *    .hostName(String) // required {@link HealthCheckResponse#getHostName() hostName}
   *    .build();
   * </pre>
   * @return A new ImmutableHealthCheckResponse builder
   */
  public static ImmutableHealthCheckResponse.Builder builder() {
    return new ImmutableHealthCheckResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableHealthCheckResponse ImmutableHealthCheckResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "HealthCheckResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PROJECT_NAME = 0x1L;
    private static final long INIT_BIT_COMMIT_ID = 0x2L;
    private static final long INIT_BIT_BUILD_VERSION = 0x4L;
    private static final long INIT_BIT_CONFIG_VERSION = 0x8L;
    private static final long INIT_BIT_HOST_NAME = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String projectName;
    private @Nullable String commitId;
    private @Nullable String buildVersion;
    private @Nullable String configVersion;
    private @Nullable String hostName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code HealthCheckResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(HealthCheckResponse instance) {
      Objects.requireNonNull(instance, "instance");
      projectName(instance.getProjectName());
      commitId(instance.getCommitId());
      buildVersion(instance.getBuildVersion());
      configVersion(instance.getConfigVersion());
      hostName(instance.getHostName());
      return this;
    }

    /**
     * Initializes the value for the {@link HealthCheckResponse#getProjectName() projectName} attribute.
     * @param projectName The value for projectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder projectName(String projectName) {
      this.projectName = Objects.requireNonNull(projectName, "projectName");
      initBits &= ~INIT_BIT_PROJECT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link HealthCheckResponse#getCommitId() commitId} attribute.
     * @param commitId The value for commitId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder commitId(String commitId) {
      this.commitId = Objects.requireNonNull(commitId, "commitId");
      initBits &= ~INIT_BIT_COMMIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link HealthCheckResponse#getBuildVersion() buildVersion} attribute.
     * @param buildVersion The value for buildVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder buildVersion(String buildVersion) {
      this.buildVersion = Objects.requireNonNull(buildVersion, "buildVersion");
      initBits &= ~INIT_BIT_BUILD_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link HealthCheckResponse#getConfigVersion() configVersion} attribute.
     * @param configVersion The value for configVersion 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder configVersion(String configVersion) {
      this.configVersion = Objects.requireNonNull(configVersion, "configVersion");
      initBits &= ~INIT_BIT_CONFIG_VERSION;
      return this;
    }

    /**
     * Initializes the value for the {@link HealthCheckResponse#getHostName() hostName} attribute.
     * @param hostName The value for hostName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder hostName(String hostName) {
      this.hostName = Objects.requireNonNull(hostName, "hostName");
      initBits &= ~INIT_BIT_HOST_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableHealthCheckResponse ImmutableHealthCheckResponse}.
     * @return An immutable instance of HealthCheckResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableHealthCheckResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableHealthCheckResponse(projectName, commitId, buildVersion, configVersion, hostName);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_PROJECT_NAME) != 0) attributes.add("projectName");
      if ((initBits & INIT_BIT_COMMIT_ID) != 0) attributes.add("commitId");
      if ((initBits & INIT_BIT_BUILD_VERSION) != 0) attributes.add("buildVersion");
      if ((initBits & INIT_BIT_CONFIG_VERSION) != 0) attributes.add("configVersion");
      if ((initBits & INIT_BIT_HOST_NAME) != 0) attributes.add("hostName");
      return "Cannot build HealthCheckResponse, some of required attributes are not set " + attributes;
    }
  }
}
