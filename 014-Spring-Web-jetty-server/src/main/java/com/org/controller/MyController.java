package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MyController {

	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("msg", "Good evening");
		return "index";
	}
}
