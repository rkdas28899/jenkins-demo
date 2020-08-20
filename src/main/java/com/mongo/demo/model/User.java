package com.mongo.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	@Id
	private long userId;
	private String firstName;
	private String lastName;
	private String city;
	private long phone;
	//private boolean isAdmin;
	//private String userPassword;
	public User(long userId, String firstName, String lastName, String city, long phone) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.phone = phone;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
