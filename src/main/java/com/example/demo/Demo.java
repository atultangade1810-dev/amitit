package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	@GetMapping("get/{a}/{b}")
	public int get(@PathVariable int a,@PathVariable int b) {
		return a+b;
		
	}
}
