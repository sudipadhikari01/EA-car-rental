package com.sudip.carrentalapplication.service.impl;

import com.sudip.carrentalapplication.domain.Customer;
import com.sudip.carrentalapplication.domain.Customers;
import com.sudip.carrentalapplication.dto.CustomerDTO;
import com.sudip.carrentalapplication.exception.customException.CustomerNotFoundException;
import com.sudip.carrentalapplication.repository.CustomerRepository;
import com.sudip.carrentalapplication.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CustomerDTO addCustomer(CustomerDTO customerDTO) {
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        Customer returnCustomer = customerRepository.save(customer);

        return modelMapper.map(returnCustomer, CustomerDTO.class);
    }

    @Override
    public void removeCustomer(Long customerId) {
        Customer customer = customerRepository.findByCustomerNumber(customerId).orElseThrow(() -> new CustomerNotFoundException("Customer not found given id: " + customerId));
        customerRepository.delete(customer);

    }

    @Override
    public CustomerDTO updateCustomer(Long customerID, CustomerDTO customerDTO) {
        Customer customer = customerRepository.findByCustomerNumber(customerID).orElseThrow(() -> new CustomerNotFoundException("Customer not found given id: " + customerID));
        customer.setEmail(customerDTO.getEmail());
        customer.setFullName(customerDTO.getFullName());
        customer.setAddress(customerDTO.getAddress());
        Customer save = customerRepository.save(customer);
        return modelMapper.map(save, CustomerDTO.class);
    }

    @Override
    public Customers findCustomer() {
        List<Customer> customerList = customerRepository.findAll();
        return new Customers(customerList);
    }

    @Override
    public CustomerDTO findByCustomerNumber(Long customerNumber) {
        Customer customer = customerRepository.findByCustomerNumber(customerNumber).orElseThrow(() -> new CustomerNotFoundException("Customer not found with given customerNumber: " + customerNumber));
        return modelMapper.map(customer, CustomerDTO.class);
    }

    @Override
    public Customers findByCustomerName(String name) {
        List<Customer> customers = customerRepository.findByFullName(name);
        return new Customers(customers);
    }

    @Override
    public CustomerDTO findByEmail(String email) {
        Customer customer = customerRepository.findByEmail(email).orElseThrow(() -> new CustomerNotFoundException("Customer not found with given email: " + email));
        return modelMapper.map(customer, CustomerDTO.class);
    }
}
