package com.hotel_management_system_api.entity;

import com.hotel_management_system_api.enums.BranchType;
import jakarta.persistence.*;

import java.util.List;

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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    @OneToOne(mappedBy = "branch")
    private Address address;

    @OneToMany(mappedBy = "branch")
    private List<Room> rooms;
}
