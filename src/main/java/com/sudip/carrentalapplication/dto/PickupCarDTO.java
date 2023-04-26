package com.sudip.carrentalapplication.dto;

import com.sudip.carrentalapplication.domain.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PickupCarDTO {

    private Long id;
    private Reservation reservation;
    private String pickupLocation;
}
