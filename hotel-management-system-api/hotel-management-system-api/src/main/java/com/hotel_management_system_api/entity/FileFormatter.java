package com.hotel_management_system_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Lob;

@Embeddable
public class FileFormatter {

    @Lob
    @Column(name="")
    private byte[] fileName;

    @Column(name="")
    private byte[] resourceUrl;

    @Column(name="")
    private byte[] directory;

    @Column(name="")
    private byte[] hash ;
}
