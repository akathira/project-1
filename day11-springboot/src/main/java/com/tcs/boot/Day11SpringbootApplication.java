package com.tcs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/so") */
@SpringBootApplication
public class Day11SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day11SpringbootApplication.class, args);
		
		//Primary source to load all the application arguments
	}
	
	/*@GetMapping("/go")
	public String greetings() {
		return "Hello from Springboot";
	}*/

}
