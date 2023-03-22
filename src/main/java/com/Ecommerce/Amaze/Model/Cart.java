package com.Ecommerce.Amaze.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cart")

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int  id;
    private int cartTotal;
    @OneToOne
    @JoinColumn
    Customer customer;
}
