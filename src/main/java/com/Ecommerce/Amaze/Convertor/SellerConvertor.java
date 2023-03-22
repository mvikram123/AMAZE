package com.Ecommerce.Amaze.Convertor;

import com.Ecommerce.Amaze.Model.Seller;
import com.Ecommerce.Amaze.RequestDto.SellerRequestDto;
import lombok.experimental.UtilityClass;

//@UtilityClass
public class SellerConvertor {
public static   Seller SellerRequestDtoToSeller(SellerRequestDto sellerRequestDto) {
    return  Seller.builder()
            .name(sellerRequestDto.getName())  // instead of
                                                          // Seller seller=new Seller()
                                                             // " seller.setName(sellerRequestDto.getName())"
            .email(sellerRequestDto.getEmail())
            .mobNo(sellerRequestDto.getMobNo())
            .panNo(sellerRequestDto.getPanNo())
            .build();

        }
}
