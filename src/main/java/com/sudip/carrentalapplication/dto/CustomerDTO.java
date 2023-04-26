package com.sudip.carrentalapplication.dto;

import com.sudip.carrentalapplication.domain.Address;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Long id;
    private Long customerNumber;
    private String fullName;
    private String email;
    private Address address;
}
