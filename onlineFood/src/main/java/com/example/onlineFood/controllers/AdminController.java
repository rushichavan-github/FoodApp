package com.example.onlineFood.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineFood.entities.Admin;
import com.example.onlineFood.exceptions.AdminAlreadyExistsException;
import com.example.onlineFood.services.AdminService;


@RestController
public class AdminController {
	
	@Autowired
	private AdminService adServ;
	
	@PostMapping("/saveAdmin")
	public ResponseEntity<Admin> saveAdmin(@RequestBody Admin ad) throws AdminAlreadyExistsException{
		Admin savedAdmin = adServ.saveAdmin(ad);
		return new ResponseEntity<>(savedAdmin,HttpStatus.OK);
	}
	
	@PostMapping("/loginAdmin")
	public ResponseEntity<String> loginAdmin(@RequestBody Admin ad){
		String string = adServ.loginAdmin(ad);
		return new ResponseEntity<>(string,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/getAdmin")
	public ResponseEntity<List<Admin>> getAdmin(){
		return new ResponseEntity<>(adServ.getAdmin(),HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public String testMethod() {
		return "API's is Running Successfully";
	}
}

