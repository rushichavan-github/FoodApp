package com.example.onlineFood.services;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Food;
import com.example.onlineFood.exceptions.FoodAlreadyExistsException;
import com.example.onlineFood.exceptions.NoFoodFoundException;



@Validated
public interface FoodService {

	Food addFoodItem(@Valid Food food)throws FoodAlreadyExistsException;

	Food updateFoodItem(@Valid Food food)throws NoFoodFoundException;

	Food fetchById(@Min(1) long id)throws NoFoodFoundException;

	List<Food> fetchAllFoodItems();

	String deleteFoodById(@Min(1) long id)throws NoFoodFoundException;

}
