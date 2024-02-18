package com.tcs.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/go")
	public String greetings(Model map) {
		map.addAttribute("location", "chennaiOne");
		return "registrationform";
	}
	

}
