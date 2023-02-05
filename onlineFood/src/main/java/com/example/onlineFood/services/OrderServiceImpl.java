package com.example.onlineFood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineFood.entities.Order;
import com.example.onlineFood.exceptions.NoOrderFoundException;
import com.example.onlineFood.repositories.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepo;
	
	@Override
	public Order addOrder(Order order) {
		return orderRepo.save(order);
	}

	@Override
	public Order updateOrder(Order order) throws NoOrderFoundException {
		if(orderRepo.existsById(order.getOrderId())){
				return orderRepo.save(order);
		}
		else{
		 throw new NoOrderFoundException();	
		}
	}

	@Override
	public Optional<Order> viewOrderById(long id) throws NoOrderFoundException {
		if(orderRepo.existsById(id)) {
			return orderRepo.findById(id);
		}else {
			throw new NoOrderFoundException();
		}
	}

	@Override
	public List<Order> viewAllOrder() {
		return orderRepo.findAll();
	}

	@Override
	public String deleteOrder(long id) throws NoOrderFoundException {
		if(orderRepo.existsById(id)) {
			orderRepo.deleteById(id);
			return "Order Deleted Successfully";
		}
		else {
			throw new NoOrderFoundException();
		}
	}
}

