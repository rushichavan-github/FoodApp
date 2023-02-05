package com.example.onlineFood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineFood.entities.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long>{

}
