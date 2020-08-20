package com.mongo.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.demo.model.User;

@Repository
public interface UserRepo extends MongoRepository<User,Long>{
	public List<User> findByCity(String city);
	public User findById(long userId);
}
