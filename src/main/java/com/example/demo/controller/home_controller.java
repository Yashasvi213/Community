package com.example.demo.controller;

import java.security.Principal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
//@RequestMapping("")
public class home_controller {
	
	
	@RequestMapping("home")
	public String homepage(Principal p)
	{
		System.out.println(p);
	  
	 String token = p.toString();
     String name = extractValue(token, "name");
     String picture = extractValue(token, "picture");
     String email = extractValue(token, "email");

	        System.out.println("Name: " + name);
	        System.out.println("Picture: " + picture);
	        System.out.println("Email: " + email);
	    

	   
	
		return "This is Home page with Name: "+name+" Picture: "+picture +"  Emaill: "+ email;
	}
	 private static String extractValue(String token, String key) {
	        String patternString = key + "=([^,}]+)";
	        Pattern pattern = Pattern.compile(patternString);
	        Matcher matcher = pattern.matcher(token);
	        if (matcher.find()) {
	            return matcher.group(1);
	        }
	        return null;
	    }
	
	

}
