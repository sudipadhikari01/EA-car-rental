package com.sudip.carrentalapplication.service.impl;

import com.sudip.carrentalapplication.domain.Car;
import com.sudip.carrentalapplication.domain.Cars;
import com.sudip.carrentalapplication.domain.Reservation;
import com.sudip.carrentalapplication.dto.ReservationDTO;
import com.sudip.carrentalapplication.exception.customException.CarNotFoundException;
import com.sudip.carrentalapplication.repository.ReservationRepository;
import com.sudip.carrentalapplication.service.CarService;
import com.sudip.carrentalapplication.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CarService carService;

    @Override
    public ReservationDTO createReservation(ReservationDTO reservationDTO) {

        Reservation reservation = modelMapper.map(reservationDTO, Reservation.class);

//        get all the cars with the brand from Carfleet
        Cars cars = carService.searchCar(reservationDTO.getCarBrand(), null);
        if (cars == null) {
            throw new CarNotFoundException("Car is not found with given type: " + reservationDTO.getCarBrand());
        }
        Car car  = cars.getCars().get(0);
        reservation.setLicensePlate(car.getLicensePlate());
        reservation.setCarBrand(car.getBrand());
        Reservation saveReservation = reservationRepository.save(reservation);

        ReservationDTO reservationDTO1 = modelMapper.map(saveReservation, ReservationDTO.class);
        return reservationDTO1;
    }
}
