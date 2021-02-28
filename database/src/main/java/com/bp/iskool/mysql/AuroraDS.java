package com.bp.iskool.mysql;

import com.bp.iskool.immutables.AuroraDbConf;
import com.typesafe.config.Config;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.annotation.Nonnull;
import javax.sql.DataSource;

public class AuroraDS {

    private static DataSource dataSource;

    private AuroraDS() {
    }

    public static DataSource createDataSource(@Nonnull Config conf) {
        Config db = conf.getConfig("aurora-db");
        return createDataSource(conf.getInt("pool-size"),
                conf.getBoolean("auto-commit-enabled"),
                conf.getDuration("connection-timeout").toMillis(),
                db.getString("url"),
                db.getString("user"),
                db.getString("password"),
                db.getString("schema"),
                db.getString("driver"));
    }

    public static DataSource createDataSource(AuroraDbConf conf) {
        return createDataSource(conf.getMaxPoolSize(),
                conf.isAutoCommit(),
                conf.getConnectionTimeout(),
                conf.getUrl(),
                conf.getUser(),
                conf.getPassword(),
                conf.getSchema(),
                conf.getDriver());
    }

    /**
     * NOTE: Do not create Datasource for each call.
     *       Create one data source and pass the same for all the queries.
     * @return return Mysql DataSource wrapped using Hikari connection pool.
     */
    private static DataSource createDataSource(int maxPoolSize,
                                       boolean autoCommit,
                                       @Nonnull long connectionTimeout,
                                       @Nonnull String url,
                                       @Nonnull String user,
                                       @Nonnull String password,
                                       @Nonnull String schema,
                                       @Nonnull String driver) {
        if (dataSource == null) {
            synchronized (AuroraDS.class) {
                if(dataSource == null) {
                    HikariConfig config = new HikariConfig();
                    config.setMaximumPoolSize(maxPoolSize);
                    config.setAutoCommit(autoCommit);
                    config.setConnectionTimeout(connectionTimeout);
                    config.setJdbcUrl(url);
                    config.setUsername(user);
                    config.setPassword(password);
                    config.setDriverClassName(driver);
                    config.setConnectionInitSql("use " + schema + ";");
                    dataSource = new HikariDataSource(config);
                }
            }
        }
        return dataSource;
    }
}
