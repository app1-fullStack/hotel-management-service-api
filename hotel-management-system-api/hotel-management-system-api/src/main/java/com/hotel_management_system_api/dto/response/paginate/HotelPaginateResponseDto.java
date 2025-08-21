package com.hotel_management_system_api.dto.response.paginate;

import com.hotel_management_system_api.dto.response.ResponseHotelDto;

import java.util.List;

public class HotelPaginateResponseDto {
    private List<ResponseHotelDto> dataList;
    private long dataCount;
}
