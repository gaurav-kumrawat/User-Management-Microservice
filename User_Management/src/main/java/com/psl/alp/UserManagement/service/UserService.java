package com.psl.alp.UserManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.alp.UserManagement.Entity.User;
import com.psl.alp.UserManagement.Entity.UsersLicense;
import com.psl.alp.UserManagement.repository.UserRepository;
import com.psl.alp.UserManagement.repository.UsersLicenseRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UsersLicenseRepository userLicenseRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void deleteUser(long userId) {
		userRepository.deleteById(userId);
	}
	
	public void updateLicense(String licenseKey,long usedId) {
		boolean add=true;
		Optional<UsersLicense> association = userLicenseRepository.findById(licenseKey);
		try {
			if(association.get()!=null) {
				add=false;
			}
		}catch(Exception ex) {
			add=true;
		}
		
		if(add) {
			userLicenseRepository.save(new UsersLicense(licenseKey, usedId));
		}else {
			userLicenseRepository.deleteById(licenseKey);
		}
	}
	
		

}
