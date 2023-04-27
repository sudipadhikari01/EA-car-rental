package com.sudip.carrentalapplication.repository;

import com.sudip.carrentalapplication.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
