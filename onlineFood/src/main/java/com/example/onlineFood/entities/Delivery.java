package com.example.onlineFood.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Delivery {
		
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    @Column(nullable = false)
	    private String deliveryAddress;
	    
	    @Column(nullable = false)
	    private String deliveryPhoneNumber;
	    
	    @Column(nullable = false)
	    private String deliveryName;
	    
	    @Column(nullable = false)
	    private String deliveryStatus;
	    
	    @Column(nullable = false)
	    private LocalDate deliveryDate;
	 
	    // getters and setters
	
}

