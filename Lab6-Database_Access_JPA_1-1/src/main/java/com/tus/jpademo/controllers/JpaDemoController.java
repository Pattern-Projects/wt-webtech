package com.tus.jpademo.controllers;

import com.tus.jpademo.dto.User;
import com.tus.jpademo.exceptions.ResourceNotFoundException;
import com.tus.jpademo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) throws ResourceNotFoundException {
		Optional<User> user = userRepository.findById(userId);
		if (user.isPresent()) {
			return ResponseEntity.ok().body(user.get());
		} else {
			throw new ResourceNotFoundException("User not found: " + userId);
		}
	}
	
	 @PostMapping("/users")
	 public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	 }
	 
}
