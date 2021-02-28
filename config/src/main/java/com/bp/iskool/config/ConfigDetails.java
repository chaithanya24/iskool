package com.bp.iskool.config;

import java.time.Duration;
import java.util.List;

public interface ConfigDetails {

    /**
     * App configuration.
     * @return app config file.
     */
    String appConfig();

    /**
     * List of default resources.
     * @return list of resources.
     */
    List<String> defaultResources();

    /**
     * Refresh interval.
     * @return duration of refresh interval.
     */
    Duration refreshInterval();


}
