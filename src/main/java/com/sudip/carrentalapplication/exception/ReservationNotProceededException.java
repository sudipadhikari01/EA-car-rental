package com.sudip.carrentalapplication.exception;

public class ReservationNotProceededException extends RuntimeException {
    public ReservationNotProceededException(String message) {
        super(message);
    }

    public ReservationNotProceededException() {
        super("Reservation can not be done");
    }
}
