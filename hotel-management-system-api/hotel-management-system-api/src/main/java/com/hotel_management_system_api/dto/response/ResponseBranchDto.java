package com.hotel_management_system_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseBranchDto {
    private String branchId;
    private String branchName;
    private String branchType;
    private int roomCount;
    private String hotelId;

}
