package com.bp.iskool.logger;

import org.slf4j.LoggerFactory;

public interface HasLogger {

    // The slf4j code caches created loggers so there shouldn't be
    // performance issues with calling getLogger many times.
    default org.slf4j.Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }
}
