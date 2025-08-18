package com.hotel_management_system_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="address")
public class Address {

    @Column(name="address_line", nullable=false, length=80)
    private String addressLine;

    @Column(name="city", nullable=false, length=100)
    private String city;

    @Column(name="coun try", nullable=false, length=100)
    private String country;

    @Column(name="address_id", nullable=false)
    private BigDecimal longitude;

    @Column(name="address_id", nullable=false)
    private BigDecimal latitude;


}
