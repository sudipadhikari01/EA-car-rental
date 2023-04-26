package com.sudip.carrentalapplication.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "car")
@Data
public class CarRentConfiguration {

    private String reserveMax;
    private String carFleetUrl;
}
