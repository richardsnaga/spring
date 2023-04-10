package com.latihanspringboot.richard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String helllo() {
		return "Hello, World!";
	}
}
