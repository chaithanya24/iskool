package com.bp.iskool.client.provider;

import com.bp.iskool.logger.HasLogger;
import org.slf4j.MDC;

import javax.inject.Singleton;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;


@Singleton
public class TxnLogger implements ContainerRequestFilter, ContainerResponseFilter, HasLogger {

    @Override
    public void filter(ContainerRequestContext requestContext)  {
        // Record request start time.
        MDC.put("start-time", String.valueOf(System.currentTimeMillis()));
        //Log message.
        getLogger().info("[uri= {}] ", uri(requestContext));
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)  {
        //Get transaction execution Time
        String stTime = MDC.get("start-time");
        if(null == stTime || stTime.length() == 0) return;
        long executionTime = System.currentTimeMillis() - Long.parseLong(stTime);
        //log message.
        MDC.remove("start-time");
        getLogger().info("[uri= {}] [response-time= {} ms] ",
                uri(requestContext),
                executionTime);
    }

    private String uri(ContainerRequestContext reqCtx) {
        return reqCtx.getMethod() + ": /" + reqCtx.getUriInfo().getPath();
    }
}
