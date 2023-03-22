package com.Ecommerce.Amaze.Controller;

import com.Ecommerce.Amaze.RequestDto.SellerRequestDto;
import com.Ecommerce.Amaze.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    SellerService sellerService;
    @PostMapping("/add")
    public String addSeller(@RequestBody SellerRequestDto sellerRequestDto)
    {
        return sellerService.addSeller(sellerRequestDto);
    }

// get all sellers
    //get seller by panNo

    //find seller by age

}
