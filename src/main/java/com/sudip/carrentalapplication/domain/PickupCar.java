package com.sudip.carrentalapplication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PickupCar {
    @Id
    @GeneratedValue
    @JoinColumn(name = "pickup_id")
    private Long id;

    @ManyToOne
    private Reservation reservation;

    //pickup location
    private String pickupLocation;
}
