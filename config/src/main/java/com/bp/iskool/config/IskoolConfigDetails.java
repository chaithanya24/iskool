package com.bp.iskool.config;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import com.bp.iskool.logger.HasLogger;
import com.typesafe.config.ConfigFactory;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class IskoolConfigDetails implements ConfigDetails, HasLogger {

    private final List<String> defaultResources;
    private final Duration interval;
    private final String dir;

    public IskoolConfigDetails() {
        URL resource = getClass().getClassLoader().getResource("app.properties");
        if (resource == null)
            throw new IllegalStateException("app.properties not populated");
        dir = ConfigFactory.parseURL(resource).getString("config-dir");
        defaultResources = Arrays.asList(
                "iskool-default.conf",
                "version.properties",
                "git.properties",
                "app.properties");
        interval = Duration.of(2, ChronoUnit.MINUTES);
        loadLogConfig();
    }

    @Override
    public String appConfig() {
        String location =  dir + "iskool.conf";
        getLogger().info("configurations loading from - " + location);
        return location;
    }

    @Override
    public List<String> defaultResources() {
        return defaultResources;
    }

    @Override
    public Duration refreshInterval() {
        return interval;
    }


    private void loadLogConfig() {
        String logbackPath = dir + "logback.xml";
        File logConfigFile = new File(logbackPath);
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        loggerContext.reset();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(loggerContext);
        // load logback settings
        try {
            if (logConfigFile.exists()) {
                configurator.doConfigure(logConfigFile);
                getLogger().info("logback settings loading from " + logConfigFile);
            } else {
                getLogger().error("not able to load logback configuration file." +
                        "fallback to default configuration " + logbackPath);
            }
        } catch (JoranException e) {
            throw new IllegalStateException("Error in loading logback configuration " + logConfigFile
                    + " " + e.getMessage());
        }
    }
}
