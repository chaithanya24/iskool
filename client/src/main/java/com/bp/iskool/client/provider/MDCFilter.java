package com.bp.iskool.client.provider;

import org.slf4j.MDC;

import javax.inject.Singleton;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.ws.rs.core.AbstractMultivaluedMap;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.TreeMap;
import java.util.UUID;
import java.util.stream.Stream;

@Singleton
public class MDCFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        //do nothing
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HeadersWrapper rqst = new HeadersWrapper((HttpServletRequest) request);
        String transactionId = rqst.getHeader("X-Trace-Id");
        String visitId = rqst.getHeader("Visit-Id");
        String xffIP = rqst.getHeader("X-Forwarded-For");
        String deviceId =  rqst.getHeader("Device-Id");
        String clientIP = request.getRemoteAddr();
        // Inserting headers to MDC for logging
        MDC.put("TRANSACTION_ID",transactionId);
        MDC.put("VISIT_ID",visitId);
        MDC.put("CLIENT_IP",clientIP);
        MDC.put("XFF_IP",xffIP);
        MDC.put("DEVICE_ID",deviceId);
        try{
            chain.doFilter(rqst,response);
        }finally {
            MDC.remove("TRANSACTION_ID");
            MDC.remove("VISIT_ID");
            MDC.remove("CLIENT_IP");
            MDC.remove("XFF_IP");
            MDC.remove("DEVICE_ID");
        }
    }

    @Override
    public void destroy() {
        // no action
    }

    static class HeadersWrapper extends HttpServletRequestWrapper {

        private final MultivaluedMap<String, String> m;

        HeadersWrapper(HttpServletRequest httpRequest) {
            super(httpRequest);
            m = new AbstractMultivaluedMap<String, String>(new TreeMap<>(String.CASE_INSENSITIVE_ORDER)){};
            Collections.list(httpRequest.getHeaderNames())
                    .forEach(s -> m.add((String) s, httpRequest.getHeader((String) s)));
            Stream.of("X-Trace-Id", "Visit-Id", "Device-Id")
                    .filter(s -> !m.containsKey(s))
                    .forEach(s -> m.add(s, UUID.randomUUID().toString()));
        }

        @Override
        public String getHeader(String name) {
            return m.getFirst(name);
        }

        @Override
        public Enumeration<String> getHeaders(String name) {
            return Collections.enumeration(m.get(name));
        }

        @Override
        public Enumeration<String> getHeaderNames() {
            return Collections.enumeration(m.keySet());
        }
    }
}
