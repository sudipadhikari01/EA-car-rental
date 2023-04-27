package com.sudip.carrentalapplication.service;

import com.sudip.carrentalapplication.domain.Cars;

public interface CarService {

    Cars searchCar(String carBrand, String carType);
}
