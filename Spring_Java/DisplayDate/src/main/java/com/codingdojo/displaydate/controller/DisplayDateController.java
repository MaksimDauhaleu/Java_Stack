package com.codingdojo.displaydate.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.codingdojo.displaydate.service.DisplayDateService;

@Controller
public class DisplayDateController {
	
	DisplayDateService dateService;
	
	@Autowired
	public DisplayDateController(DisplayDateService dateService) {
		this.dateService = dateService;
	}

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	
	@RequestMapping("/date")
	public String date(Model model) {
		model.addAttribute("date", dateService.getDate());
		return "Date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		model.addAttribute("time", dateService.getTime());
		return "Time.jsp";
	}
	
	
}

