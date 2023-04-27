package com.sudip.carrentalapplication.domain;

import com.sudip.carrentalapplication.domain.enums.CarType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue
    @JoinColumn(name = "reservation_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private CarType carType;

    @Temporal(TemporalType.DATE)
    private Date reservationDate;

    //car that is booked
    private String licensePlate;

    private String carBrand;

    //total price
    @NotNull
    private Double totalPrice;
}
