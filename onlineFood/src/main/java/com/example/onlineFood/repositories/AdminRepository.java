package com.example.onlineFood.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onlineFood.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
