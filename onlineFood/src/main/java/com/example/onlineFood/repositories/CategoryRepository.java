package com.example.onlineFood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineFood.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
