package com.hotel_management_system_api.util;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

public class ByteCodeHandler {
    public Blob stringToBlob(String s) throws SQLException {
        if (s == null) {
            return null; // Handle null input gracefully
        }
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        return new SerialBlob(bytes);
    }
}