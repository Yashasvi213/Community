package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class organisation {
	 	@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int uid;
		String name;
		String email;
		String mob;
		String Category;
		String userid;
		String image;
	

}
