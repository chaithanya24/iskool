package com.bp.iskool.mysql;

import com.bp.iskool.util.HasCloseable;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Query implements HasCloseable {

    private final DataSource ds;

    public Query(DataSource ds) {
        if (ds == null)
            throw new IllegalStateException("require data source to use user query service");
        this.ds = ds;
    }

    protected Connection getConnection() {
        Connection cn = null;
        try {
            cn = ds.getConnection();
        } catch (SQLException e) {
            getLogger().error("sql exception trying to open the connection, exception", e);
        }
        return cn;
    }

    protected <T> List<T> query(Connection cn, PreparedStatement ps, RSConvert<T> converter) {
        List<T> result = new LinkedList<>();
        try {
            if(isNotValid(cn, ps)) return result;
            ResultSet rs = ps.executeQuery();
            result = awaitConverter(converter, rs);
            close(rs, ps, cn);
        } catch (SQLException e) {
            getLogger().error("sql exception executing query, exception", e);
            close(ps, cn);
        }
        return result;
    }

    protected int update(Connection cn, PreparedStatement ps) {
        int update = 0;
        try {
            if(isNotValid(cn, ps)) return update;
            cn.setAutoCommit(false);
            update = ps.executeUpdate();
            cn.commit();
            cn.setAutoCommit(true);
            close(ps, cn);
        } catch (SQLException e) {
            rollback(cn);
            close(ps, cn);
            throw new RuntimeException("exception executing insert/update, reason: " +e.getMessage(), e);
        }
        return update;
    }

    private void rollback(Connection cn) {
        try {
            if (cn != null) cn.rollback();
        } catch (SQLException ex) {
            getLogger().error("transaction rolled back");
            close(cn);
        }
    }

    private boolean isNotValid(Connection cn, PreparedStatement ps) {
        boolean flag = (cn == null ||  ps == null);
        if (flag) close(ps, cn);
        return flag;
    }

    /**
     * This is just to prevent execution wont release the resources (releaseResources)
     * before processing the result set. Ideally, this should not happen, but you never
     * know..??
     * Note: Time out here is basically for the time for Java process to parse the
     * result set, so do we need to configure this...Duhhh...no please..!
     **/
    private <T> List<T> awaitConverter(RSConvert<T> converter, ResultSet rs) {
        try {
            if (converter != null)
                return CompletableFuture
                        .supplyAsync(() -> converter.toDtos(rs))
                        .get(30, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e ) {
            getLogger().error("exception processing result set, exception: ", e);
            close(rs);
        }
        return Collections.emptyList();
    }
}
