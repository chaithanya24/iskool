package com.bp.iskool.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConfigRegister {

    private static final List<ConfigListener> configListeners = new ArrayList<>();
    private static ConfigDetails configDetails;

    public static void register(
            ConfigListener listener,
            ConfigDetails details) {
        synchronized (configListeners) {
            configListeners.add(listener);
            if (details == null || isDifferentDetails(details))
                throw new IllegalStateException("received null config details or different config details then existing" +
                        " currently only one config details expected per process");
        }
    }

    static List<ConfigListener> getListeners() {
        return configListeners;
    }

    static ConfigDetails getConfigDetails() {
        if (configDetails == null ||
                configDetails.appConfig() == null ||
                configDetails.refreshInterval() == null)
            throw new IllegalStateException("valid configurations details such as application specific " +
                    "configurations file and config refresh interval required to load dynamic configurations.");
        return configDetails;
    }

    private static boolean isDifferentDetails(ConfigDetails details) {
        if (configDetails == null) {
            configDetails = details;
            return false;
        } else if (!configDetails.appConfig().equals(details.appConfig())) {
            return true;
        } else if (configDetails.refreshInterval().toMillis() !=
                    details.refreshInterval().toMillis()) {
            return true;
        } else {
            Collections.sort(configDetails.defaultResources());
            Collections.sort(details.defaultResources());
            return !configDetails.defaultResources().equals(details.defaultResources());
        }
    }
}
