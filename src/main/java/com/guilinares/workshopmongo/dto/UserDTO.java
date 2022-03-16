package com.guilinares.workshopmongo.dto;

import java.io.Serializable;

import com.guilinares.workshopmongo.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 6689616120606972735L;

	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
	}
	
	//Instantiate a UserDTO based in an User entity
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
