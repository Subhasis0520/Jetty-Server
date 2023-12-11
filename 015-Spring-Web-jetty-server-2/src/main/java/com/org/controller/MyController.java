package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class MyController {

	@GetMapping("/")
	@ResponseBody
	public String display() {
		return "Good Evening..!";
	}
	
	@GetMapping("/greet")
	public String greet(Model m) {
		m.addAttribute("msg", "Welcome to the haven");
		return "index";
	}
}
