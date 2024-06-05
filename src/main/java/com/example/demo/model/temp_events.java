package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class temp_events {
 	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int teid;
 	//a foreign key of organisation_id
 	String title;
 	String description;
 	int dateOfEvent;
 	String venue;
 	int fee;
 	String termsAndCond;
 	int dateOfPost;
 	//image
 	boolean status;
 	

}
