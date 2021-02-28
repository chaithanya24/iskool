package com.bp.iskool.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class LoadAppConfig {

    private final ConfigDetails details;

    public LoadAppConfig(ConfigDetails details) {
        this.details = details;
    }

    public Config load() {
        //Extract and combine config from resources.
        List<URL> resources = getResourcesUrl();
        List<Config> configs = resources.stream()
                .map(ConfigFactory::parseURL)
                .collect(Collectors.toList());

        // set config dir for local or for integration tests.
        Config defaultConf = combineConfigs(configs);

        //Extract App config.
        Config appConf = ConfigFactory.parseFile(new File(details.appConfig()));
        // App configurations can't be empty.
        if (appConf.isEmpty())
            throw new IllegalStateException("unable to load the application specific configurations," +
                    " config location: " + details.appConfig());

        //return configuration.
        return appConf.withFallback(defaultConf).resolve();
    }

    private Config combineConfigs(List<Config> configs) {
        Config c = ConfigFactory.empty();
        for (Config conf : configs) {
            c = c.withFallback(conf).resolve();
        }
        return c;
    }


    private List<URL> getResourcesUrl() {
        ClassLoader classLoader = getClass().getClassLoader();
        return details.defaultResources()
                .stream()
                .map(classLoader::getResource)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }
}
