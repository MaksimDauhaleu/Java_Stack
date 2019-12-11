package com.dauhaleu.license.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dauhaleu.license.models.License;
import com.dauhaleu.license.models.Person;
import com.dauhaleu.license.service.LicenseService;




@Controller
public class LicenseController {

		
		public final LicenseService serviceL;
		
		public  LicenseController(LicenseService serviceL) {
			this.serviceL = serviceL;
		}
		
		@RequestMapping("/license/new")
		public String license() {
			
			return "license.jsp";
		}
		
		
		@RequestMapping("/person/{id}")
		public String show() {
			List<Person> allPersons = serviceL.allPersons();
			return "show.jsp";
		}
		
		//Create Person
		@RequestMapping("/person/new")
		public String newSong(@ModelAttribute("person") Person person){
			return "person.jsp";
		}
		
		
		//Create Person
		@RequestMapping(value = "/person", method=RequestMethod.POST)
		public String create(@ModelAttribute("person") Person person, BindingResult result){
		    if (result.hasErrors()) {
	            return "person.jsp";
	        } else {
	            serviceL.createPerson(person);
	            return "redirect:/person/1";
	        }
		}
		
		public String newLicense(@ModelAttribute("licenseObject") License license, Model model) {
			List<Person> personslist = serviceL.allPersons();
			model.addAttribute("personslist", personslist);
			ArrayList<String> states = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
					"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
					"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
					"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
					"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
					"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
					"Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
			model.addAttribute("states", states);
			return "license.jsp";
		}
		
		@RequestMapping(value="/addlicense", method=RequestMethod.POST)
		public String addlicense(@Valid @ModelAttribute("licenseObject") License license, BindingResult result) {
			if (result.hasErrors()) {
				return "license.jsp";
			}
			else {
				String number = serviceL.generateLicenseNumber();
				license.setLn(number);
				serviceL.addLicense(license);
				return "redirect:/persons/" +license.getId();
			}
		}

		
		
}
