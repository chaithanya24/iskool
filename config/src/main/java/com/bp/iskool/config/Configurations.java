package com.bp.iskool.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import static com.bp.iskool.config.ConfigRegister.getConfigDetails;
import static com.bp.iskool.config.ConfigRegister.getListeners;
import static com.bp.iskool.utils.Helper.PrettyJson.toPrettyJsString;

public class Configurations {

    private static Config config;
    private static Configurations instance;
    private static LoadAppConfig appConf;
    private static boolean isRefreshed;
    private final static Logger logger = LoggerFactory.getLogger("Configurations");

    private Configurations() {
    }

    public static Configurations getInstance() {
        if (instance == null) {
            synchronized (Configurations.class) {

                ConfigDetails details = getConfigDetails();
                if (details == null ||
                        details.appConfig() == null ||
                        details.refreshInterval() == null)
                    throw new IllegalStateException("valid configurations details such as application specific " +
                            "configurations file and config refresh interval required to load dynamic configurations.");
                long loadInterval = interval(details);
                long notifyInterval = interval(details) + 2000;
                appConf = new LoadAppConfig(details);
                //Load config for the first time
                load();
                Executors.newSingleThreadScheduledExecutor()
                        .scheduleAtFixedRate(
                                Configurations::load,
                                loadInterval,
                                loadInterval,
                                TimeUnit.MILLISECONDS);
                Executors.newSingleThreadScheduledExecutor()
                        .scheduleAtFixedRate(
                                Configurations::notifyListeners,
                                notifyInterval,
                                notifyInterval,
                                TimeUnit.MILLISECONDS);
                instance = new Configurations();
            }
        }
        return instance;
    }

    private static void load() {
        Config conf = appConf.load();
        Config c = conf.withFallback(conf.getConfig("app-sensitive-conf"));
        if (config != null && (c.isEmpty() || c.entrySet().equals(config.entrySet()))) {
            logger.info("application configuration remains same");
            isRefreshed = false;
        } else {
            String val = conf.withValue(
                    "app-sensitive-conf", ConfigValueFactory.fromAnyRef("######"))
                    .root()
                    .render(ConfigRenderOptions.concise());
            logger.info(toPrettyJsString(val).orElse(val));
            config = c;
            isRefreshed = true;
        }
    }

    private static void notifyListeners() {
        if (isRefreshed)
            getListeners().forEach(listener -> wrapExc(ConfigListener::configRefresh, listener));
    }

    private static long interval(ConfigDetails details) {
        long interval = details.refreshInterval().toMillis();
        if (interval < 0)
            throw new IllegalArgumentException("refresh interval cannot be negative");
        return interval;
    }

    public Config getConfig() {
        return config;
    }

    private static void wrapExc(Consumer<ConfigListener> func,
                                ConfigListener listener) {
        try {
            func.accept(listener);
        } catch (Exception ex) {
            logger.info("exception refreshing configuration, exception: " + ex);
        }
    }

}
