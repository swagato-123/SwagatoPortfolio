package com.basepackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller 
public class AppController {
	
	@GetMapping("/")
	String portfolio()
	{
		return "index";
	}
	
	

}
