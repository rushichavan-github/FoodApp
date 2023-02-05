package com.example.onlineFood.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Admin;
import com.example.onlineFood.exceptions.AdminAlreadyExistsException;



@Validated
public interface AdminService {

	Admin saveAdmin(@Valid Admin ad)throws AdminAlreadyExistsException;

	String loginAdmin(Admin ad);

	List<Admin> getAdmin();

}
