package com.sudip.carrentalapplication.dto;

import com.sudip.carrentalapplication.domain.Payment;
import com.sudip.carrentalapplication.domain.PickupCar;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnCarDTO {
    private Long id;
    private String returnLocation;
    private PickupCar pickupCar;
    private Payment payment;
}
