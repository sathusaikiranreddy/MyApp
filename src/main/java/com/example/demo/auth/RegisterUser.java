package com.example.demo.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterUser {
	
	private static Logger logger = LoggerFactory.getLogger(RegisterUser.class);
	
	@GetMapping("/user")
	public static String registerNewUser(UserModel uobj) {
		logger.debug("this is regisert user logger {}", System.currentTimeMillis());
		return "registered";
	}

}
