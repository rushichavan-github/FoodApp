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

import com.example.onlineFood.entities.Customer;
import com.example.onlineFood.exceptions.NoCustomerFoundException;
import com.example.onlineFood.services.CustomerService;



/**
 * 
 * @author rushikesh chavan
 *
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cusServ;
	
	/**
	 * 
	 * @param customer
	 * @return the added customer
	 */
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomers(@RequestBody Customer customer){
		Customer saveCustomer= cusServ.addCustomer(customer);
		return new ResponseEntity<>(saveCustomer,HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws NoCustomerFoundException
	 */
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Optional<Customer>> fetchCustomerById(@PathVariable long id) throws NoCustomerFoundException{
		Optional<Customer> customer = cusServ.getById(id);
		return new ResponseEntity<>(customer,HttpStatus.FOUND);
	}
	
	/**
	 * 
	 * @param customer
	 * @return the updated customer
	 * @throws NoCustomerFoundException if no customer found
	 */
	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) throws NoCustomerFoundException{
		Customer upCust = cusServ.updateCustomer(customer);
		return new ResponseEntity<>(upCust,HttpStatus.ACCEPTED);
	}
	
	/**
	 * 
	 * @return All customers
	 */
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Customer>> fetchAllCustomers(){
		List<Customer> allCusList= cusServ.getAllCustomer();
		return new ResponseEntity<>(allCusList,HttpStatus.FOUND);
	}
	
	/**
	 * 
	 * @param id
	 * @return String message that customer is deleted
	 * @throws NoCustomerFoundException when customer is not present
	 */
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeCustomer(@PathVariable int id) throws NoCustomerFoundException{
		return new ResponseEntity<>(cusServ.removeCustomer(id), HttpStatus.ACCEPTED);
		
	}
}
