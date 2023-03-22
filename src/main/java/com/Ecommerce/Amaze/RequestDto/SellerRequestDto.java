package com.Ecommerce.Amaze.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SellerRequestDto {
    private String name;
    private String email;
    private String panNo;
    private String mobNo;

}
