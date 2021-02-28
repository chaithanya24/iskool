package com.bp.iskool.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Helper {

    public static class PrettyJson {

        private static Logger logger = LoggerFactory.getLogger("Helper.PrettyJson");
        private static ObjectMapper mapper = new ObjectMapper();

        public static Optional<String> toPrettyJsString(String value) {
            try {
                Object json = mapper.readValue(value, Object.class);
                return Optional.ofNullable(mapper
                        .writerWithDefaultPrettyPrinter()
                        .writeValueAsString(json));
            } catch (JsonProcessingException e) {
                logger.error("exception parsing string: {} to pretty json, exception: {}", value, e);
            }
            return Optional.empty();
        }
    }
}
