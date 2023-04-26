package com.sudip.carrentalapplication.service;

import com.sudip.carrentalapplication.domain.Customers;
import com.sudip.carrentalapplication.dto.CustomerDTO;

public interface CustomerService {

    CustomerDTO addCustomer(CustomerDTO customerDTO);

    void removeCustomer(Long customerId);

    CustomerDTO updateCustomer(Long customerID, CustomerDTO customerDTO);

    Customers findCustomer();

    CustomerDTO findByCustomerNumber(Long customerNumber);

    Customers findByCustomerName(String name);

    CustomerDTO findByEmail(String email);


}
