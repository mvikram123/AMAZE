package com.Ecommerce.Amaze.Model;

import com.Ecommerce.Amaze.Enum.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String price;
    private int quantity;
    @Enumerated(EnumType.STRING)
    Category category;
    @ManyToOne
    @JoinColumn
    Seller seller;
    @OneToOne(mappedBy = "product" ,cascade = CascadeType.ALL)
    Item item;

}
