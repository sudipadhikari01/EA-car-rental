package com.sudip.carrentalapplication.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Embeddable
@Data
public class Address {

    private String city;
    private String street;
    private String county;
}
