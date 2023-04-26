package com.sudip.carrentalapplication.dto;

import com.sudip.carrentalapplication.domain.Reservation;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {

    private long id;
    private Double amount;
    private Integer cvv;
    private String paymentType;
}
