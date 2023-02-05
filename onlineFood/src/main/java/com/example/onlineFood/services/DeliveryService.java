package com.example.onlineFood.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.example.onlineFood.entities.Delivery;



@Validated
public interface DeliveryService {
		
	List<Delivery> getAllDeliveries();
    Optional<Delivery> getDeliveryById(@Min(1) long id);
    Delivery createDelivery(@Valid Delivery delivery);
    Delivery updateDelivery(@Valid Delivery delivery);
}
