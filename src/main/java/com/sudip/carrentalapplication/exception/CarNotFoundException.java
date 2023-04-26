package com.sudip.carrentalapplication.exception;

public class CarNotFoundException extends RuntimeException {

    public CarNotFoundException(String message) {
        super(message);
    }

    public CarNotFoundException() {
        super("Car is not found with given license number");
    }
}
