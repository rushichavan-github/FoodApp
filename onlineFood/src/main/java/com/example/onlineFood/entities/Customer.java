package com.example.onlineFood.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;
	@NotNull
	@Size(min=5)
	private String name;
	@NotNull
	@Size(min=5,max=20)
	private String password;
	@NotNull
	private String address;
	@NotNull
	private long mobileNumber;
	@NotNull
	private String emailId;
	

}
