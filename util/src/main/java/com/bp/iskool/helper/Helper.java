package com.bp.iskool.helper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Date;
import java.util.Optional;
import java.util.TimeZone;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class Helper {

    public static class PrettyJson {

        private static final ObjectMapper mapper = new ObjectMapper();

        public static <T> Optional<String> toPrettyJson(T t) {
            try {
                return Optional.ofNullable(mapper
                        .writerWithDefaultPrettyPrinter()
                        .writeValueAsString(t));
            } catch (JsonProcessingException e) {
                throw new IllegalArgumentException("exception while parsing", e);
            }
        }

        public static <T> String toJson(T t) {
            try {
                return mapper.writeValueAsString(t);
            } catch (JsonProcessingException e) {
                throw new IllegalArgumentException("exception while parsing", e);
            }
        }

        public static JsonNode toJsonNode(String value) {
            try {
                return mapper.readTree(value);
            } catch (IOException e) {
                throw new IllegalArgumentException("exception while parsing", e);
            }
        }

        public static String getTextVal(JsonNode node, String name) {
            return node.at("/" + name)
                    .asText("MISSING");
        }

        public static int getIntVal(JsonNode node, String name) {
            return node.at("/" + name)
                    .asInt(-1);
        }

        public static boolean getBoolVal(JsonNode node, String name) {
            return node.at("/" + name)
                    .asBoolean(false);
        }
    }

    public static class DateFormatter {

        private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MMM dd yyyy hh:mm:ss:SSS z");

        public static String dateStringWithZone(Date date, ZoneId zoneId) {
            DATE_FORMAT.setTimeZone(TimeZone.getTimeZone(zoneId));
            return DATE_FORMAT.format(date);
        }

        /*
        Used for testing, all the test dates validated in UTC.
         */
        public static String dateStringInUTC(Date date) {
            DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
            return DATE_FORMAT.format(date);
        }
    }

    public static class Util {
        public static boolean isMissingValue(String value) {
            return (StringUtils.isBlank(value)|| value.equals("MISSING"));
        }

        public static boolean isNotMissingValue(String value) {
            return !isMissingValue(value);
        }

        public static String encodedVal(String val) {
            return Base64.getEncoder().encodeToString(val.getBytes());
        }

        public static String encodedVal(byte[] val) {
            return Base64.getEncoder().encodeToString(val);
        }

        public static String decodedVal(String val) {
            return new String(Base64.getDecoder().decode(val));
        }
    }

    public static class Compression {

        public static String compressAndBase64(String input) {
            try {
                byte[] compress = compress(input.getBytes());
                return Util.encodedVal(compress);
            } catch (Exception e) {
                throw new IllegalArgumentException("exception while compressing string", e);
            }
        }

        private static byte[] compress(byte[] data) throws IOException {
            Deflater deflater = new Deflater(Deflater.HUFFMAN_ONLY, true);
            deflater.setInput(data);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
            deflater.finish();
            byte[] buffer = new byte[1024];
            while (!deflater.finished()) {
                int count = deflater.deflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();
            return outputStream.toByteArray();
        }

        public static String decompressAndBase64(String input) {
            try {
                byte[] decode = Base64.getDecoder().decode(input);
                byte[] decompress = decompress(decode);
                return new String(decompress, StandardCharsets.UTF_8);
            } catch (Exception e) {
                throw new IllegalArgumentException("exception while decompressing string", e);
            }
        }

        private static byte[] decompress(byte[] data) throws IOException, DataFormatException {
            Inflater inflater = new Inflater(true);
            inflater.setInput(data);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
            byte[] buffer = new byte[1024];
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            outputStream.close();
            return outputStream.toByteArray();
        }
    }
}
