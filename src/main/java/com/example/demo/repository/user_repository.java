package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.user;

public interface user_repository extends JpaRepository<user,Integer> {

}
