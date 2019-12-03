package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class HelloHuman {

	@RequestMapping("/{firstName}/{lastName}")
	public String human(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
		if(firstName == null || lastName == null) {
			return clear();
		}else{
			return "Hello " + firstName + lastName;
		}
	}
	
	@RequestMapping("/")
	public String clear() {
		return "Hello Human";
	}
}
