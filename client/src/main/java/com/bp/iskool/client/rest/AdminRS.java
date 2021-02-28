package com.bp.iskool.client.rest;

import com.bp.iskool.client.immutable.dto.HealthCheckResponse;
import com.bp.iskool.client.immutable.dto.ImmutableHealthCheckResponse;
import com.bp.iskool.config.ConfigListener;
import com.bp.iskool.config.ConfigRegister;
import com.bp.iskool.config.Configurations;
import com.bp.iskool.config.IskoolConfigDetails;
import com.bp.iskool.logger.HasLogger;
import com.google.inject.Inject;
import com.typesafe.config.Config;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Path("/")
@Tag(name = "Health Check APIs")
public class AdminRS implements ConfigListener, HasLogger {

    private String projectName;
    private String commitId;
    private String buildVersion;
    private String configVersion;

    @Inject
    public AdminRS() {
        ConfigRegister.register(this, new IskoolConfigDetails());
        configRefresh();
    }

    /*
     Exposed for testing
     */
    public AdminRS(String projectName,
                   String commitId,
                   String buildVersion,
                   String configVersion) {
        this.projectName = projectName;
        this.commitId = commitId;
        this.buildVersion = buildVersion;
        this.configVersion = configVersion;
    }

    @GET
    @Path("isAlive")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Get Application Alive State",
            description = "Lists details of Application version, configuration, version",

            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Application Alive state",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = HealthCheckResponse.class)
                            )
                    )
            }
    )
    public Response isAlive() {
        return Response.status(200)
                .entity(buildResponse())
                .build();
    }

    //TODO- Chaithanya: make use of IsReady API properly.
    @GET
    @Path("isReady")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Get Application Ready State",
            description = "Lists details of Application version, configuration, version",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Application ready state",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = HealthCheckResponse.class)
                            )
                    )
            }
    )
    public Response isReady() {
        return Response.status(200)
                .entity(buildResponse())
                .build();
    }

    private HealthCheckResponse buildResponse() {
        return ImmutableHealthCheckResponse.builder()
                .projectName(projectName)
                .commitId(commitId)
                .buildVersion(buildVersion)
                .configVersion(configVersion)
                .hostName(getHostName())
                .build();
    }

    private String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ignored) {
        }
        return "NONE";
    }

    @Override
    public void configRefresh() {
        Config conf = Configurations.getInstance().getConfig();
        projectName = conf.getString("project-name");
        commitId = conf.getString("git.commit.id");
        buildVersion = conf.getString("build-version");
        configVersion = conf.getString("config-version");
        getLogger().info("admin rest service is ready");
    }
}
