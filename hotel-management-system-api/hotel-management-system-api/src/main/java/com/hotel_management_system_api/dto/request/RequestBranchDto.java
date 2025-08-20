package com.hotel_management_system_api.dto.request;

import com.hotel_management_system_api.enums.BranchType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestBranchDto {

    private String branchName;
    private BranchType branchType;
    private int roomCoount;
    private String hoteId;

}
