package com.example.onlineFood.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlineFood.entities.Order;
import com.example.onlineFood.exceptions.NoOrderFoundException;
import com.example.onlineFood.services.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
		
		@Autowired
		private OrderService ordServ;
		
		@PostMapping("/add")
		public ResponseEntity<Order> addOrder(@RequestBody Order order){
			Order savedOrder = ordServ.addOrder(order);
			return new ResponseEntity<>(savedOrder,HttpStatus.OK);
		}
		
		@PutMapping("/update")
		public ResponseEntity<Order> updateOrder(@RequestBody Order order) throws NoOrderFoundException{
			Order updateOrder = ordServ.updateOrder(order);
			return new ResponseEntity<>(updateOrder,HttpStatus.ACCEPTED);
		}
		
		@GetMapping("/view/{id}")
		public ResponseEntity<Optional<Order> > viewOrderById(@PathVariable long id) throws NoOrderFoundException{
			Optional<Order>  order = ordServ.viewOrderById(id);
			return new ResponseEntity<> (order,HttpStatus.OK);
		}
		
		@GetMapping("/viewAll")
		public ResponseEntity<List<Order>> viewAllOrder(){
			List<Order> allOrder = ordServ.viewAllOrder();
 		return new ResponseEntity<>(allOrder,HttpStatus.FOUND);
		}
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<String> deleteOrder(@PathVariable long id) throws NoOrderFoundException{
			String  m = ordServ.deleteOrder(id);
			return new ResponseEntity<>(m,HttpStatus.ACCEPTED);
		}
		
}
