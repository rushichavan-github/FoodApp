package com.example.onlineFood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineFood.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
