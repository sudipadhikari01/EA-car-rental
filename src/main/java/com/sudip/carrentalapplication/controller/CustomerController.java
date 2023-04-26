package com.sudip.carrentalapplication.controller;

import com.sudip.carrentalapplication.domain.Customers;
import com.sudip.carrentalapplication.dto.CustomerDTO;
import com.sudip.carrentalapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentals/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // find all customer
    @GetMapping
    public ResponseEntity<?> findAllCustomers() {
        Customers customers = customerService.findCustomer();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    //create customer
    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO dto = customerService.addCustomer(customerDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    //remove customer
    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeCustomer(@PathVariable("id") Long custId) {
        customerService.removeCustomer(custId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    //update customer
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCustomer(@PathVariable("id") Long custId, @RequestBody CustomerDTO customerDTO) {
        CustomerDTO dto = customerService.updateCustomer(custId, customerDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //find by customerNumber
    @GetMapping("/{customerNumber}")
    public ResponseEntity<?> findCustomerByNumber(@PathVariable("customerNumber") Long customerNumber) {
        CustomerDTO dto = customerService.findByCustomerNumber(customerNumber);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    // find Customer by email
    @GetMapping("/email")
    public ResponseEntity<?> findCustomerByEmail(@RequestParam(value = "email") String email) {
        CustomerDTO dto = customerService.findByEmail(email);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    //find Customer by name
    @GetMapping("/customerName")
    public ResponseEntity<?> findByCustomerName(@RequestParam(value = "customerName") String customerName) {
        Customers customers = customerService.findByCustomerName(customerName);
        return new ResponseEntity<>(customers, HttpStatus.OK);

    }


}
