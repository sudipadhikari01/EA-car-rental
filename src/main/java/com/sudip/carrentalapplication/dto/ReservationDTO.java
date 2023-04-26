package com.sudip.carrentalapplication.dto;

import com.sudip.carrentalapplication.domain.Customer;
import com.sudip.carrentalapplication.domain.enums.CarType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDTO {
    private Long id;
    private Customer customer;
    private CarType carType;
    private Date reservationDate;
    private String licensePlate;
    private String carBrand;
    private Double totalPrice;
}
