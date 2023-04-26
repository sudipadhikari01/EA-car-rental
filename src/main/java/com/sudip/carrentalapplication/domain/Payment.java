package com.sudip.carrentalapplication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    @JoinColumn(name="payment_id")
    private long id;
    private Double amount;
    private Integer cvv;
    private String paymentType;

}
