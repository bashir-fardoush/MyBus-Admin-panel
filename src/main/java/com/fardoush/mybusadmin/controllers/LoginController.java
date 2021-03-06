package com.fardoush.mybusadmin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fardoush.mybusadmin.services.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public String getLoginPage(Model model, @RequestParam(name="error", required=false) Boolean error) {
		model.addAttribute("error",error);
		return "auth/login";
	}
	

	/*
	@GetMapping("/index")
	public String getIndexPage(Model model) {
		
	loginService.Adduser();	
	loginService.addBus();
	loginService.addDriver();
	loginService.addStoppage();
	loginService.addRoute();
	
	model.addAttribute("message"," Saved successfully");
				
		return "index";
	}
	*/
}
