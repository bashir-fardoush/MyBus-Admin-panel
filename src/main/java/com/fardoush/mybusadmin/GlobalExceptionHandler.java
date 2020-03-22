package com.fardoush.mybusadmin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fardoush.mybusadmin.exceptions.ResourceAlreadyExistsException;
import com.fardoush.mybusadmin.exceptions.ResourceNotFoundException;

@Component
@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(code = HttpStatus.CONFLICT)
	@ExceptionHandler(ResourceAlreadyExistsException.class)
	public String handleConflic(HttpServletRequest req, Exception e, Model model) {
	
		e.printStackTrace();
		model.addAttribute("errorMessage", e.getMessage());
		
		return "error";
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFoundException(HttpServletRequest req, Exception e, Model model) {
		e.printStackTrace();
		model.addAttribute("errorMessage", e.getMessage());
		
		
		return "error";
	}
	
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(RuntimeException.class)
	public String  handleRuntimeExcepton(HttpServletRequest req,  Exception e, Model model) {
		
		model.addAttribute("message",e.getMessage());	
		e.printStackTrace();
		return "error";
	}

	
	
	
}
