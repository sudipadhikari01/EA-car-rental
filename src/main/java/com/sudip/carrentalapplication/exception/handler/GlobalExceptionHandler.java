package com.sudip.carrentalapplication.exception.handler;

import com.sudip.carrentalapplication.exception.ErrorMessage;
import com.sudip.carrentalapplication.exception.customException.CarNotFoundException;
import com.sudip.carrentalapplication.exception.customException.CustomerNotFoundException;
import com.sudip.carrentalapplication.exception.customException.ReservationNotProceededException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Component
public class GlobalExceptionHandler {

    @ExceptionHandler({CarNotFoundException.class, CustomerNotFoundException.class, ReservationNotProceededException.class})
    public ResponseEntity<?> carNotFoundExceptionHandler(CarNotFoundException ex) {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}
