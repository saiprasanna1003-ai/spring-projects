package com.example.simplewebapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	
	@RequestMapping("/")
	public String greet() {
		return "Welcome to Web App!!!!!";
	}
	
	@RequestMapping("/about")
	public String meth() {
		return "Hii, I'm about page!!!!";
	}
}
