package com.hotel_management_system_api.dto.response.paginate;

import com.hotel_management_system_api.dto.response.ResponseBranchDto;

import java.util.List;

public class BranchPaginateResponseDto {
    private List<ResponseBranchDto> dataList;
    private long dataCount;
}
