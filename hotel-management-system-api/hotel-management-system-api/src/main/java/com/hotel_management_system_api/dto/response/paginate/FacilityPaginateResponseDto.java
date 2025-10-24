package com.hotel_management_system_api.dto.response.paginate;

import com.hotel_management_system_api.dto.response.ResponseFacilityDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> dataList;
    private long dataCount;
}
