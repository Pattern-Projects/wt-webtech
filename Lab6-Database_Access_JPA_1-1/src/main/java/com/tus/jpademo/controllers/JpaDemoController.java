package com.tus.jpademo.controllers;

import com.tus.jpademo.dto.User;
import com.tus.jpademo.exceptions.ResourceNotFoundException;
import com.tus.jpademo.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaDemoController {
	 @Autowired
	 private UserRepository userRepository;
	
	@GetMapping("/")
	public String index() {
		return "hi";
	}
	
	@GetMapping("/users")
	List<User> getUsers() {
		return userRepository.findAll();
	}
}
