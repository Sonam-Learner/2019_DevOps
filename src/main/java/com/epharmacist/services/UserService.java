package com.epharmacist.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.epharmacist.models.Role;
import com.epharmacist.models.User;
import com.epharmacist.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository userRepository;
	
	public void createUser(User user) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		user.setStatus("VERIFYING");
		Role userRole=new Role("USER");
		List<Role> roles=new ArrayList<>();
		roles.add(userRole);
		user.setRoles(roles);
		userRepository.save(user);
	
	}
	
	public User findOne(String email) {
		return userRepository.findOne(email);
	}
	
	public boolean isUserPresent(String email) {
		User u=userRepository.findOne(email);
		if(u!=null)
			return true;
		return false;
	}

}
