package com.fardoush.mybusadmin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLoginPage() {
		
		return "login";
	}
	
	@GetMapping("/index")
	public String getIndexPage(Model model) {
		
		return "index";
	}
	
}
