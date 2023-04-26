package com.sudip.carrentalapplication.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Customers {

    private List<Customer> customers = new ArrayList<>();

    public Customers(List<Customer> customers) {
        this.customers = customers;
    }
}
