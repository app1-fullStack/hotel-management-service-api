package com.hotel_management_system_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="room")
public class Room {

    @Id
    @Column(name="room_number", length=80)
    private String roomNumber;

    @Column(name="room_id", length=80)
    private String roomId;

    @Column(name="room_type", length=80)
    private String roomType;

    @Column(name="bed_count", length=80)
    private int bedCount;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="is_available")
    private boolean isAvailable;




}
