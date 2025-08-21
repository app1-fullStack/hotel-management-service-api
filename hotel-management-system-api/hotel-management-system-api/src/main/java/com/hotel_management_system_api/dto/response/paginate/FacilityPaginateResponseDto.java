package com.hotel_management_system_api.dto.response.paginate;

import com.hotel_management_system_api.dto.response.ResponseFacilityDto;

import java.util.List;

public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> dataList;
    private long dataCount;
}
