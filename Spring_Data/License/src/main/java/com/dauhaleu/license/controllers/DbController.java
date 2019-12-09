package com.dauhaleu.license.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dauhaleu.license.models.License;
import com.dauhaleu.license.models.Person;
import com.dauhaleu.license.service.LicenseService;



@RestController
public class DbController {
	
	public final LicenseService lookifySer;
	
	public DbController(LicenseService lookifySer) {
		this.lookifySer = lookifySer;
	}
	
	@RequestMapping("/api/license")
	public List<License> lidense() {
		return lookifySer.allLicense();
	}
	
	
	@RequestMapping("/api/lookify")
	public List<Person> person() {
		return lookifySer.allPersons();
	}
	
	@RequestMapping(value="/api/person", method=RequestMethod.POST)
	public Person createBook(@RequestParam(value="first_name") String first_name, @RequestParam(value="last_name") String last_name) {
		Person book = new Person(first_name,last_name);
		return lookifySer.createPerson(book);
	}
	
	
	
	
}