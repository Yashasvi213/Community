package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.user;
import com.example.demo.repository.user_repository;

@Service
public class user_service_impl implements user_service{

user_repository ures;
	
	public user_service_impl(user_repository ures) {
		super();
		this.ures = ures;
	}
	
	@Override
	public String saveuser(user users) {
	ures.save(users);
		return "Success";
	}

}
