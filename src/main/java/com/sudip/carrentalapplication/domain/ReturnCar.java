package com.sudip.carrentalapplication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnCar {
    @Id
    @GeneratedValue
    @Column(name = "returncar_id")
    private Long id;

    //car return location
    private String returnLocation;

    @ManyToOne
    private PickupCar pickupCar;

    @ManyToOne
    private Payment payment;


}
