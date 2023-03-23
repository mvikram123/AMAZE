package com.Ecommerce.Amaze.RequestDto;

import com.Ecommerce.Amaze.Enum.ProductCategory;
import com.Ecommerce.Amaze.Enum.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductRequestDto {
    private int sellerId;
    private String productName;
    private int price;
    private int quantity;
  //  private String mobNo;
    private ProductCategory productCategory;

   //private ProductStatus productStatus;
}
