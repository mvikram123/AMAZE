package com.Ecommerce.Amaze.Model;

import com.Ecommerce.Amaze.Enum.ProductCategory;
import com.Ecommerce.Amaze.Enum.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private int price;
    private int quantity;
    @Enumerated(EnumType.STRING)
    ProductStatus productStatus;
    @Enumerated(EnumType.STRING)
    ProductCategory productCategory;
    @ManyToOne
    @JoinColumn
    Seller seller;
    @OneToOne(mappedBy = "product" ,cascade = CascadeType.ALL)
    Item item;

}
