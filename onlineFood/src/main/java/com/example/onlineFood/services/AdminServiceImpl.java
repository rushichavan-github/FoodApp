package com.example.onlineFood.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlineFood.entities.Admin;
import com.example.onlineFood.exceptions.AdminAlreadyExistsException;
import com.example.onlineFood.repositories.AdminRepository;



@Service
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	private AdminRepository adRepo;
	
	@Override
	public Admin saveAdmin(Admin ad) throws AdminAlreadyExistsException {
		if(adRepo.existsById(ad.getId())) {
			throw new AdminAlreadyExistsException();
		}
		
		return adRepo.save(ad);
	}

	@Override
	public String loginAdmin(Admin ad) {
		Optional<Admin> admin =adRepo.findById(ad.getId());
		if(admin.isPresent()) {
			if((admin.get().getAdminPassword().equals(ad.getAdminPassword()))
					&& (admin.get().getAdminUserName().equals(ad.getAdminUserName()))) {
				return "Successfully Logged In";
			}
		}
		return "Invalid Credentials";
	}

	@Override
	public List<Admin> getAdmin() {
		return adRepo.findAll();
	}

}
