package com.hotel_management_system_api.dto.response.paginate;

import com.hotel_management_system_api.dto.response.ResponseRoomDto;

import java.util.List;

public class RoomPaginateResponseDto {
    private List<ResponseRoomDto> dataList;
    private long dataCount;
}
