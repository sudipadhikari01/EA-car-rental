package com.sudip.carrentalapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car implements Serializable {
    private String licensePlate;
    private String carType;
    private String brand;
    private Double price;
}
