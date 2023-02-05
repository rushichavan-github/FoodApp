package com.example.onlineFood.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "food_id")
	private long foodId;
	@NotNull
	private String foodName;
	@NotNull
	private double foodCost;
	private int quantity;
	@OneToOne
	@JoinColumn(name = "category_Id")
	private Category category;
	
	
}
