package com.Ecommerce.Amaze.Service;

import com.Ecommerce.Amaze.Convertor.ProductConverter;
import com.Ecommerce.Amaze.Exception.SellerNotFoundException;
import com.Ecommerce.Amaze.Model.Product;
import com.Ecommerce.Amaze.Model.Seller;
import com.Ecommerce.Amaze.Repository.SellerRepository;
import com.Ecommerce.Amaze.RequestDto.ProductRequestDto;
import com.Ecommerce.Amaze.ResponseDto.ProductResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    SellerRepository sellerRepository;
    public ProductResponseDto addProduct(ProductRequestDto productRequestDto) throws SellerNotFoundException {
        Seller seller;
        try {
            seller =sellerRepository.findById(productRequestDto.getSellerId()).get();
        }
        catch(Exception e)
        {
            throw new SellerNotFoundException("Invalid SellerId");
        }

        Product product= ProductConverter.productRequestDtoToProduct(productRequestDto);
        product.setSeller(seller);
        seller.getProducts().add(product);


        sellerRepository.save(seller);// save the seller and product - parent and child



//        ProductResponseDto productResponseDto= ProductResponseDto.builder()
//        .name(productRequestDto.getProductName())
//                .price(productRequestDto.getPrice())
//                .quantity(productRequestDto.getQuantity())
//                .productStatus(productRequestDto.getProductStatus())
//
//                .build();
       // return product;



        //prepare response
        ProductResponseDto productResponseDto=ProductConverter.productToProductResponseDto(product);
        return productResponseDto;

    }

}
