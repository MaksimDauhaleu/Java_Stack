package com.dauhaleu.dojoninja.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dauhaleu.dojoninja.models.Dojo;
import com.dauhaleu.dojoninja.models.Ninja;
import com.dauhaleu.dojoninja.services.ServiceFile;


@Controller
public class DojoNinjaController {
	
	//Service File SetUp
	public final ServiceFile service;
	
	public DojoNinjaController(ServiceFile service) {
		this.service = service;
	}
	
	
	@RequestMapping("/allDojos")
	public String allDojos(Model model) {
		List<Dojo> allDojos = service.allDojos();
		model.addAttribute("dojos", allDojos);
		return "dojos.jsp";
	}
	
	@RequestMapping("/allNinjas")
	public String allNinjas(Model model) {
		List<Ninja> allNinjas = service.allNinjas();
		model.addAttribute("ninjas", allNinjas);
		return "ninjas.jsp";
	}
	
	@RequestMapping("/createDojo")
	public String createDojoPage(@ModelAttribute("name") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@RequestMapping(value = "/post/createDojo", method=RequestMethod.POST)
	public String createDojo(@ModelAttribute("name") String dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "createDojo.jsp";
		}else{
			Dojo some = new Dojo(dojo);
			service.createDojo(some);
			return "redirect:/allDojos";
		}

	}
	
	
}
