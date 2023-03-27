package com.Ecommerce.Amaze.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="orders")
@Builder

public class Ordered
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp

    private Date orderDate;
    private int total;
    private int deliveryCharge;
    private String cardUsedForPayment;
    private int totalCost;
    @ManyToOne
    @JoinColumn
    Customer customer;
    @OneToMany(mappedBy = "order" ,cascade = CascadeType.ALL)
    @Builder.Default

    List<Item> items=new ArrayList<>();

}
