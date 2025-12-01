package com.hotel_management_system_api.util;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;



@Service
public static class ByteCodeHandlerService {

}
public class ByteCodeHandler {
    public Blob stringToBlob(String s) throws SQLException {
        if (s == null) {
            return null; // Handle null input gracefully
        }
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        return new SerialBlob(bytes);
    }
}