package com.example.onlineFood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineFood.entities.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long>{

}
