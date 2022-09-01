package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "<html><body><h1 style=\"color:red;\">Greetings from Tanzu Application Platform</h1><p>based on Spring</p></body></html>";
	}

}
