package com.hotel_management_system_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="room_image")
public class RoomImage {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Embedded
    private FileFormatter fileFormatter;


}
