package com.Ecommerce.Amaze.RequestDto;

import com.Ecommerce.Amaze.Enum.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SellerRequestDto {
    private String name;
    private String email;

    private String mobNo;
    private String panNo;
    @Enumerated(EnumType.STRING)
    ProductCategory productCategory;

}
