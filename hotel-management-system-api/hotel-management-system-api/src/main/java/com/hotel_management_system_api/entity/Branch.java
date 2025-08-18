package com.hotel_management_system_api.entity;

import com.hotel_management_system_api.enums.BranchType;
import jakarta.persistence.*;

@Entity
@Table(name="branch")
public class Branch {
    @Id
    @Column(name="branch")
    private String branchId;

    private int roomCount;

    @Enumerated(EnumType.STRING)
    @Column(name="branch_type", nullable=false)
    private BranchType branchType ;

    @Column(name="branch_name", nullable=false)
    private String branchNmae;

}
