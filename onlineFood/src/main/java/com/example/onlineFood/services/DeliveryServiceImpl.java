package com.example.onlineFood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineFood.entities.Delivery;
import com.example.onlineFood.repositories.DeliveryRepository;


@Service
public class DeliveryServiceImpl implements DeliveryService{
	@Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    @Override
    public Delivery updateDelivery(Delivery delivery) {
          return deliveryRepository.save(delivery);
          
    }
    
    @Override
	public Optional<Delivery> getDeliveryById(long id) {
		
		return deliveryRepository.findById(id);
	}
}

