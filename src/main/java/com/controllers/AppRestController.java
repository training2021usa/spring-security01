package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class AppRestController {
	
	@GetMapping("/getMessage")
		
		public String greeting(){
			
			return "spring security example";
		}
		
	}
	
	


