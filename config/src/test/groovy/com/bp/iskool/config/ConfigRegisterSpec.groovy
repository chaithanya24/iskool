import com.bp.iskool.config.ConfigDetails
import com.bp.iskool.config.Configurations
import com.typesafe.config.Config
import spock.lang.Specification
import com.bp.iskool.config.ConfigListener
import ConfigDetailsHelper

import java.time.Duration
import java.time.temporal.ChronoUnit

import static com.bp.iskool.config.ConfigRegister.register

class ConfigRegisterSpec extends Specification {


    def "test config loader"() {
        when:
        def appConf = "src/test/resources/test.tve-util.conf"
        def h = new SampleConfigListener(appConf)
        h.configRefresh()
        def config = h.latest()

        then:
        config.getString("app-sensitive-conf.password") == "sample password"
        config.getString("project-name") == "tve-util"
        config.getString("sample-config") == "sample config"
        config.getBoolean("sample-config-enabled")
    }

    def "test config loader without app configuration"() {
        when:
        def appConf = "test.tve-util.conf"
        new SampleConfigListener(appConf).configRefresh()

        then:
        def e = thrown(IllegalStateException)
        e.getMessage() == "received null config details or different config details then existing currently only one config details expected per process"
    }



    class SampleConfigListener implements ConfigListener {

        private Config config;

        SampleConfigListener(String appConf) {
            register(this, new ConfigDetailsHelper(appConf))
        }

        @Override
        void configRefresh() {
            config = Configurations.getInstance().getConfig()
        }

        Config latest(){
           config
        }
    }

    static class ConfigDetailsHelper implements ConfigDetails {

        String appConfig
        List<String> resources
        Duration interval

        ConfigDetailsHelper(String appConf) {
            appConfig = appConf
            resources = ["test.tve-util-default.conf",
                         "version.properties"]
            interval = Duration.of(1, ChronoUnit.MINUTES)
        }

        @Override
        String appConfig() {
            appConfig
        }

        @Override
        List<String> defaultResources() {
            resources
        }

        @Override
        Duration refreshInterval() {
            interval
        }
    }
}
