package com.sudip.carrentalapplication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    @JoinColumn(name = "customer_id")
    private long id;

    @Column(nullable = false, unique = true)
    private long customerNumber;

    private String fullName;

    @Email(message = "Proper email format is required")
    @Column(unique = true)
    private String email;

    @Embedded
    private Address address;
}
