package com.example.onlineFood.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cart {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "cart_id")
		private long cartId;
		private double price;
		private int quantity;
		@OneToOne
		@JoinColumn(name = "customer_id")
		private Customer customer;
		@OneToMany
		private List<Food> foodItem=new ArrayList<>();
}

