package com.Ecommerce.Amaze.Repository;

import com.Ecommerce.Amaze.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface SellerRepository extends JpaRepository<Seller,Integer> {
}
