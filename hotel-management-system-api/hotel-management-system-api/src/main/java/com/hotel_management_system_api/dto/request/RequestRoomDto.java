package com.hotel_management_system_api.dto.request;

import java.math.BigDecimal;

public class RequestRoomDto {
    private int bedCount;
    private boolean isAvailable;
    private BigDecimal price;
    private String roomNumber;
    private String roomType;
    private String branchId;
}
