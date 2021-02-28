package com.bp.iskool.client.provider;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Provider
public class CORSFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext request, ContainerResponseContext response) {
        //Enable CORS for all origin servers.
        MultivaluedMap<String, Object> resHdrs = response.getHeaders();
        resHdrs.add("Access-Control-Allow-Origin", "*"); //TODO: Chaithanya - change the restrictions.
        resHdrs.add("Access-Control-Allow-Headers",
                "origin, content-type, accept, X-Trace-Id, Visit-Id, Device-Id");
        resHdrs.add("Access-Control-Allow-Credentials", "true");
        resHdrs.add("Access-Control-Allow-Methods", "GET, POST");
    }
}
