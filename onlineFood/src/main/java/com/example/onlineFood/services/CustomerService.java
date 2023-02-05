package com.example.onlineFood.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Customer;
import com.example.onlineFood.exceptions.NoCustomerFoundException;



@Validated
public interface CustomerService {

	public Customer addCustomer(@Validated Customer customer);

	public Optional<Customer> getById(@Min(1)long id) throws NoCustomerFoundException;

	public Customer updateCustomer(@Valid Customer customer)throws NoCustomerFoundException;

	public List<Customer> getAllCustomer();

	public String removeCustomer(@Min(1) long id) throws NoCustomerFoundException;
	
}
