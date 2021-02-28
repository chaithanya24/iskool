package com.bp.iskool.client.immutable.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.immutables.value.Value;

@Value.Immutable
@JsonPropertyOrder({"message", "charter_api_host", "project_version", "hash", "config_version"})
public interface HealthCheckResponse {
    @JsonProperty("message") String getProjectName();
    @JsonProperty("hash") String getCommitId();
    @JsonProperty("project_version") String getBuildVersion();
    @JsonProperty("config_version") String getConfigVersion();
    @JsonProperty("charter_api_host") String getHostName();
}
