package com.sudip.carrentalapplication.service.impl;

import com.sudip.carrentalapplication.config.CarRentConfiguration;
import com.sudip.carrentalapplication.domain.Cars;
import com.sudip.carrentalapplication.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CarRentConfiguration carRentConfiguration;

    @Override
    public Cars searchCar(String carBrand, String carType) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(carRentConfiguration.getCarFleetUrl()+"/search")
                .queryParam("carBrand", carBrand)
                .queryParam("carType", carType);
        String uri = builder.toUriString();

        return  restTemplate.getForObject(uri,Cars.class);
    }
}
