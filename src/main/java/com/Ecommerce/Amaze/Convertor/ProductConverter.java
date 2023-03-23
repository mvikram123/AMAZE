package com.Ecommerce.Amaze.Convertor;

import com.Ecommerce.Amaze.Enum.ProductStatus;
import com.Ecommerce.Amaze.Model.Product;
import com.Ecommerce.Amaze.RequestDto.ProductRequestDto;
import com.Ecommerce.Amaze.ResponseDto.ProductResponseDto;

public class ProductConverter {
    public static Product productRequestDtoToProduct(ProductRequestDto productRequestDto)
    {
        return Product.builder()
                .productName(productRequestDto.getProductName())
                .price(productRequestDto.getPrice())
                .productCategory(productRequestDto.getProductCategory())
                .quantity(productRequestDto.getQuantity())
                .productStatus(ProductStatus.AVAILABLE)         //productStatus is not mentioned in productReqeustDto.So I do hard code

                .build();
    }
    public static ProductResponseDto productToProductResponseDto(Product product)
    {
        ProductResponseDto productResponseDto= ProductResponseDto.builder()
                .name(product.getProductName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .productStatus(product.getProductStatus())

                .build();
        return productResponseDto;
    }
}
