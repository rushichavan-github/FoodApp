package com.example.onlineFood.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Order;
import com.example.onlineFood.exceptions.NoOrderFoundException;



@Validated
public interface OrderService {

	Order addOrder(@Valid Order order);

	Order updateOrder(@Valid Order order)throws NoOrderFoundException;

	Optional<Order>  viewOrderById(@Min(1) long id)throws NoOrderFoundException;

	List<Order> viewAllOrder();

	String deleteOrder(@Min(1)long id)throws NoOrderFoundException;

}

