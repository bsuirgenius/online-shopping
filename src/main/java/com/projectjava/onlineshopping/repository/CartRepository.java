package com.projectjava.onlineshopping.repository;

import com.projectjava.onlineshopping.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cartRepository")
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
