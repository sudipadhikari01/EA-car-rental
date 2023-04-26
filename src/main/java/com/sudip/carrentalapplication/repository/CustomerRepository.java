package com.sudip.carrentalapplication.repository;

import com.sudip.carrentalapplication.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByCustomerNumber(Long customerNumber);

    List<Customer> findByFullName(String name);

    Optional<Customer> findByEmail(String email);

}
