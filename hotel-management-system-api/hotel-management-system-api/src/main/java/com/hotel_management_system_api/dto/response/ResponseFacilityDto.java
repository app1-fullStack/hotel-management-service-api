package com.hotel_management_system_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseFacilityDto {
    private Long id;
    private String Name;
    private String roomId;
}
