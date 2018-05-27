package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello-world";
	}
}
