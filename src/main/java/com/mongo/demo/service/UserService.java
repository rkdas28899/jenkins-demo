package com.mongo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.demo.model.User;
import com.mongo.demo.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo repo;
	
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}

	public User deleteUser(long userId) {
		// TODO Auto-generated method stub
		User deletedUser = repo.findById(userId);
		repo.delete(deletedUser);
		return deletedUser;
	}

	public User updateUser(User newUser) {
		// TODO Auto-generated method stub
		User user = repo.findById(newUser.getUserId());
		user.setFirstName(newUser.getFirstName());
		user.setLastName(newUser.getLastName());
		user.setPhone(newUser.getPhone());
		user.setCity(newUser.getCity());
		repo.save(user);
		return user;
	}

	public User getUser(long userId) {
		// TODO Auto-generated method stub
		return repo.findById(userId);
		}
	
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	public List<User> findByCity(String city) {
		// TODO Auto-generated method stub
		return repo.findByCity(city);
		}
	
	public void deleteAllUsers() {
		repo.deleteAll();
	}

}
