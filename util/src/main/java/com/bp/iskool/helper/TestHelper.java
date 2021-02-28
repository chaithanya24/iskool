package com.bp.iskool.helper;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class TestHelper {

    public static class MockClock extends Clock {

        private long now;

        public MockClock (long now) {
            this.now = now;
        }
        @Override
        public ZoneId getZone() {
            return ZoneId.of("UTC");
        }

        @Override
        public Clock withZone(ZoneId zone) {
            return this;
        }

        @Override
        public Instant instant() {
            return Instant.ofEpochMilli(now);
        }

        public void setNow(long now) {
            this.now = now;
        }
    }
}
