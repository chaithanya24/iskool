package com.bp.iskool.mysql;


import com.bp.iskool.util.HasCloseable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface Prepare extends HasCloseable {

    String query();

    default PreparedStatement prepareQuery(Connection cn, Object... values) {
        PreparedStatement ps = null;
        try {
            if (cn == null) return null;
            ps = cn.prepareStatement(query());
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    ps.setObject(i + 1, values[i]);
                }
            }
        } catch (SQLException e) {
            getLogger().error("sql exception executing query, exception", e);
            close(ps);
        }
        return ps;
    }

}
