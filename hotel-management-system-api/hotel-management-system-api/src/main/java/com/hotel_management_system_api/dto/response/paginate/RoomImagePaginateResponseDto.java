package com.hotel_management_system_api.dto.response.paginate;

import com.hotel_management_system_api.dto.response.ResponseRoomImageDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagePaginateResponseDto {
    private List<ResponseRoomImageDto> dataList;
    private long dataCount;
}
