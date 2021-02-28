package com.bp.iskool.mysql;


import com.bp.iskool.util.HasCloseable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface RSConvert<T> extends HasCloseable {

    T toDto(ResultSet rs) throws SQLException;

    default List<T> toDtos(ResultSet rs) {
        List<T> results = new ArrayList<>();
        if (rs == null) return results;
        try {
            while (rs.next()) {
                results.add(toDto(rs));
            }
        } catch (SQLException e) {
            getLogger().error("exception while processing result set, exception ", e);
            close(rs);
        }
        return results;
    }
}
