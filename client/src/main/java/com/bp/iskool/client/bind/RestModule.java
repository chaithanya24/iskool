package com.bp.iskool.client.bind;

import com.bp.iskool.client.provider.CORSFilter;
import com.bp.iskool.client.provider.MDCFilter;
import com.bp.iskool.client.provider.TxnLogger;
import com.bp.iskool.client.rest.AdminRS;
import com.bp.iskool.client.servlet.SwaggerServlet;
import com.google.inject.Scopes;
import com.google.inject.servlet.ServletModule;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.mustache.MustacheMvcFeature;
import org.glassfish.jersey.servlet.ServletContainer;


public class RestModule extends ServletModule {

    RestModule() {
    }

    @Override
    protected void configureServlets() {
        //Register all the RS services in ResourceCOnfig
        ResourceConfig resourceConfig = new ResourceConfig();

        //register swagger
        registerSwagger(resourceConfig);

        //Register AdminRs
        resourceConfig.register(new AdminRS());

        //register filters
        resourceConfig.register(MDCFilter.class);
        resourceConfig.register(TxnLogger.class);
        resourceConfig.register(CORSFilter.class);

        ServletContainer container = new ServletContainer(resourceConfig);
        bind(ServletContainer.class).in(Scopes.SINGLETON);
        filter("/*").through(MDCFilter.class);
        serve("/*").with(container);
    }

    private void registerSwagger(ResourceConfig resourceConfig) {
        resourceConfig.register(new SwaggerServlet());
        resourceConfig.register(MustacheMvcFeature.class);
        resourceConfig.register(OpenApiResource.class);
        resourceConfig.property(MustacheMvcFeature.TEMPLATE_BASE_PATH, "/");
        resourceConfig.property(MustacheMvcFeature.CACHE_TEMPLATES, true);
    }
}


