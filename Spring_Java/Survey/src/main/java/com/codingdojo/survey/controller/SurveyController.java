package com.codingdojo.survey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.survey.service.*;


@Controller
public class SurveyController {
	
	
	SurveyService surveyService;
	
	@Autowired
	public SurveyController(SurveyService service) {
		this.surveyService = service;
	}
	

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/proccess")
	public String proccess(@RequestParam("name") String name, @RequestParam("locations") String locations, @RequestParam("language") String language, @RequestParam("comment") String comment) {
	surveyService.proccess(name,locations,language,comment);
	return "redirect:/result";
	}
	
	
	@RequestMapping("/result")
	public String result(Model model) {
		model.addAttribute("name", surveyService.getName());
		model.addAttribute("locations", surveyService.getLocation());
		model.addAttribute("language", surveyService.getLanguage());
		model.addAttribute("comment", surveyService.getComment());
		return "result.jsp";
	}
	
}

