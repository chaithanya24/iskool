package com.bp.iskool.client.bind;

import com.bp.iskool.config.ConfigListener;
import com.bp.iskool.config.ConfigRegister;
import com.bp.iskool.config.Configurations;
import com.bp.iskool.config.IskoolConfigDetails;
import com.bp.iskool.logger.HasLogger;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.typesafe.config.Config;

import java.time.Clock;
import java.time.ZoneId;

public class MainConfiguration extends GuiceServletContextListener implements HasLogger {

    protected Injector getInjector() {

        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        Config config = new RegisterConfig().getConfig();

        //Kinesis client.
        //Inject the required beans.
        return Guice.createInjector().createChildInjector(new RestModule());
    }

    private static class RegisterConfig implements ConfigListener {
        private Config config;

        RegisterConfig() {
            ConfigRegister.register(this, new IskoolConfigDetails());
            configRefresh();
        }

        @Override
        public void configRefresh() {
            config = Configurations.getInstance().getConfig();
        }

        public Config getConfig() {
            return this.config;
        }
    }
}
