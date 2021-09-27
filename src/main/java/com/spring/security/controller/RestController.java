package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	String get() {
		return "Welcome";
	}
	
	@GetMapping("/admin")
	String getAdmin() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	String getUser() {
		return "Welcome";
	}
}
