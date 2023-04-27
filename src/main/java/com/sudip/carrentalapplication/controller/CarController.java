package com.sudip.carrentalapplication.controller;

import com.sudip.carrentalapplication.domain.Cars;
import com.sudip.carrentalapplication.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rentals/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/search")
    public ResponseEntity searchCar(@RequestParam(value = "carBrand", required = false) String brand, @RequestParam(value = "carType", required = false) String type) {
        Cars cars = carService.searchCar(brand, type);
        return new ResponseEntity(cars, HttpStatus.OK);
    }
}
