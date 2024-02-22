package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.auth.RegisterUser;
import com.example.demo.auth.UserModel;

@RestController
public class UserRegisterController {
	
	
	private static Logger logger = LoggerFactory.getLogger(RegisterUser.class);
	
	@PostMapping("/userRegistration")
	public static String registerUser(@RequestBody UserModel userModel) {
		logger.debug("this is request body data {}", userModel.toString());
		return userModel.toString();
	}
	

	@GetMapping("/user")
	public static String registerNewUser(UserModel uobj) {
		logger.debug("this is regisert user logger {}", System.currentTimeMillis());
		return "registered";
	}

}
