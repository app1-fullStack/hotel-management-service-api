package com.hotel_management_system_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="hotel")
public class Hotel {
    @Id
    @Column(name="hotel_id")
    private String hotelId;

    @Column(name="hotel_name", nullable=false, length=100)
    private String hotelName;

    @Column(name="star_rating", nullable=false)
    private int star_rating;

    @Column( nullable=false)
    @Lob
    private Blob description;

    @Column(name="created_at", nullable=false)
    private LocalDateTime created_at;

    @Column(name="updated_at", nullable=false)
    private LocalDateTime updated_at;

    @Column(name="activeStatus")
    private boolean activeStatus;

    @Column(name="startingFrom")
    private BigDecimal startingFrom;

    @OneToMany(mappedBy ="hotel", cascade=CascadeType.ALL)
    private List<Branch> branches;

}
