package com.Technosignia.HRMS.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to the first spring boot application";
	}
}
