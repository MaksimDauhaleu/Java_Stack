package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/greeting")
public class HelloPage {

	  	@RequestMapping("")
	    public String hello(@RequestParam(value = "q", required = false) String search) { 
		  return "You searched for: " + search;
	    }
	    
	    @RequestMapping("/random")
	    public String random() {
			return "random";
	    }
	    
	    @RequestMapping("/m/{track}/{module}/{lesson}")
	    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
	    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
	    }
}
