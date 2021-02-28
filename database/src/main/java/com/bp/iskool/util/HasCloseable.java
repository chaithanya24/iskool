package com.bp.iskool.util;

import com.bp.iskool.logger.HasLogger;

public interface HasCloseable extends HasLogger {

    default void close(AutoCloseable... closeables) {
        if (closeables == null) return;
        for (AutoCloseable closeable : closeables) {
            try {
                if (closeable != null) closeable.close();
            } catch (Exception e) {
                getLogger().error("exception closing, closeable {} and exception: {}", closeable, e);
            }
        }
    }
}
