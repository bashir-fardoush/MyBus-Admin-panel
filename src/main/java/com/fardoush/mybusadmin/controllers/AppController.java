package com.fardoush.mybusadmin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	/**Index page works as dashboard */
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String getIndexPage(Model model) {
				
		return "index";
	}
	
	
}
