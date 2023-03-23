package com.Ecommerce.Amaze.Controller;

//import com.Ecommerce.Amaze.Exception.SellerNotFoundException;
import com.Ecommerce.Amaze.RequestDto.ProductRequestDto;
import com.Ecommerce.Amaze.ResponseDto.ProductResponseDto;
import com.Ecommerce.Amaze.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping("/product")

public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("/add")
    public ResponseEntity addProduct(@RequestBody ProductRequestDto productRequestDto) {
        ProductResponseDto productResponseDto;
        try {
          productResponseDto = productService.addProduct(productRequestDto);

        }
        catch(Exception e)
        {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(productResponseDto,HttpStatus.ACCEPTED);

    }

}
