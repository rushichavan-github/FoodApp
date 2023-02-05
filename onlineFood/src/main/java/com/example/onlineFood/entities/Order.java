package com.example.onlineFood.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Order_details")
public class Order{
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long orderId;
		private LocalDate orderDate;
		private String orderStatus;
		
		@ManyToOne
		@JoinColumn(name="customer_id")
		private Customer customer;
}
