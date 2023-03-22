package com.Ecommerce.Amaze.Service;

import com.Ecommerce.Amaze.Convertor.SellerConvertor;
import com.Ecommerce.Amaze.Model.Seller;
import com.Ecommerce.Amaze.Repository.SellerRepository;
import com.Ecommerce.Amaze.RequestDto.SellerRequestDto;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Builder
@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public String addSeller(SellerRequestDto sellerRequestDto) {

//        Seller seller = Seller.builder()
//                .name(sellerRequestDto.getName())  // instead of
//                                                            // Seller seller=new Seller()
//                                                            // " seller.setName(sellerRequestDto.getName())"
//                .email(sellerRequestDto.getEmail())
//                .mobNo(sellerRequestDto.getMobNo())
//                .panNo(sellerRequestDto.getPanNo())
//                .build();
      Seller seller = SellerConvertor.SellerRequestDtoToSeller(sellerRequestDto);
        sellerRepository.save(seller);
      return "congrats ! Now you can sell their products on amaze";
    }

}
