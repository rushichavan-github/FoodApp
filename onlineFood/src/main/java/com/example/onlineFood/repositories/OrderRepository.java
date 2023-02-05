package com.example.onlineFood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineFood.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
