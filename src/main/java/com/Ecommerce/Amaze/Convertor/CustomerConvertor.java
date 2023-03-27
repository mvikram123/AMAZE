package com.Ecommerce.Amaze.Convertor;

import com.Ecommerce.Amaze.Model.Customer;
import com.Ecommerce.Amaze.RequestDto.CustomerRequestDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerConvertor {
    public static Customer customerRequestDtoToCustomer(CustomerRequestDto customerRequestDto)
    {
        return Customer.builder()
                .name(customerRequestDto.getName())
                .age(customerRequestDto.getAge())
                .mobNo(customerRequestDto.getMobNo())
                .email(customerRequestDto.getEmail())
                .build();
    }
}
