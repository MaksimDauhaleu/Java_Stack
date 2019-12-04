package com.codingdojo.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired;
import com.codingdojo.counter.service.*;
import javax.servlet.http.HttpSession;



@Controller
 public class CounterController {
	
	CounterService counterService;
	
	@Autowired
	public CounterController(CounterService service) {
		this.counterService = service;
	}
	
	@RequestMapping("/counter")
	
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
        Integer count = (Integer) session.getAttribute("count");
		count += 1;
		session.setAttribute("count", count);
		return "counter.jsp";
	}
	
	@RequestMapping("/counterTwo")
	
	public String two(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
        Integer count = (Integer) session.getAttribute("count");
		count += 2;
		session.setAttribute("count", count);
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		if (session != null) {
		    session.invalidate();
		}
		return "redirect:/counter";
	}
}





