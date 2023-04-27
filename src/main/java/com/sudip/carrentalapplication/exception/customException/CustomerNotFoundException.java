package com.sudip.carrentalapplication.exception.customException;

public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message) {
        super(message);
    }

    public CustomerNotFoundException() {
        super("Customer not found with give id");
    }
}
