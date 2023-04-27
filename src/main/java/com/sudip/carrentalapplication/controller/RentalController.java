package com.sudip.carrentalapplication.controller;

import com.sudip.carrentalapplication.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rentals/reserve")
public class RentalController {

    @Autowired
    private ReservationService reservationService;
}
