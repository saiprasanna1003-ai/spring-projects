package com.example.simplewebapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// WE have  a controller called "FRONT CONTROLLER"
//That accepts the client request and sends that request to corresponding controller
//which has that endpoint like /about,/login, etc.,

@RestController
public class LoginController {

	@RequestMapping("/login")
	public String open() {
		return "Login Page!!!!";
	}
}
