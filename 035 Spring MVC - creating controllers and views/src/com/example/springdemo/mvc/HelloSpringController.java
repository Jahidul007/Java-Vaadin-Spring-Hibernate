package com.example.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringController {
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloSpring-form";
	}
	
	// need to a controller method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloSpring";
	}
	
	//new a controller method to read form data and 
	// add data to the method
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request ,Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		
		//convert the data to all caps 
		theName = theName.toUpperCase();
		
		// create the message 
		String result ="Yo! "+theName;
		
		//add to the model 
		model.addAttribute("message", result);
		
		
		return "helloSpring";
	}
	

}
