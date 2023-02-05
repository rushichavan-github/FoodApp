package com.example.onlineFood.services;

import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Cart;
import com.example.onlineFood.exceptions.FoodAlreadyExistsException;
import com.example.onlineFood.exceptions.NoCartFoundException;
import com.example.onlineFood.exceptions.NoFoodFoundException;


@Validated
public interface CartService {

	Cart addItemToCart(Cart cart,@Min(1) long foodId, long customerId)throws FoodAlreadyExistsException;

	Cart removeItem(@Min(1)long cartId,@Min(1) long foodId)throws NoCartFoundException, NoFoodFoundException;

	Cart clearCart(@Min(1)long cartId)throws NoCartFoundException;

	Cart updateCart(Cart cart, long foodId)throws NoCartFoundException;


}

