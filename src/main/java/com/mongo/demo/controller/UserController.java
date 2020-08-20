package com.mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.demo.model.User;
import com.mongo.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping("/create")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@GetMapping("/get/{userId}")
	public User getUser(@PathVariable long userId) {
		return service.getUser(userId);
	}
	@GetMapping("/getAll")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	@DeleteMapping("/delete/{userId}")
	public User deleteUser(@PathVariable long userId) {
		return service.deleteUser(userId);
	}
	@DeleteMapping("/deleteAll")
	public String deleteAllUsers() {
		service.deleteAllUsers();
		return "All users deleted";
	}
}
