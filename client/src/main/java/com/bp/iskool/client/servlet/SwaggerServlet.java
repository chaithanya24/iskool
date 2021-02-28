package com.bp.iskool.client.servlet;

import com.bp.iskool.logger.HasLogger;
import io.swagger.v3.oas.annotations.Hidden;
import org.glassfish.jersey.server.mvc.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/swagger-ui")
@Hidden
public class SwaggerServlet implements HasLogger {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response swagger(){
        getLogger().info("Swagger UI requested");
        return Response.ok(new Viewable("/index.mustache")).build();
    }
}
