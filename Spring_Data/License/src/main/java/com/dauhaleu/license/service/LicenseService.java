package com.dauhaleu.license.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dauhaleu.license.models.License;
import com.dauhaleu.license.models.Person;
import com.dauhaleu.license.repositories.LicenseRepository;
import com.dauhaleu.license.repositories.PersonRepository;




@Service
public class LicenseService {
	
private final LicenseRepository licenseRepository;
private final PersonRepository personR;



	public LicenseService(LicenseRepository licenseR, PersonRepository personR) {
		this.licenseRepository = licenseR; 
		this.personR = personR; 
	}
	
	public Person createPerson(Person b) {
		return personR.save(b);
	}
	
	public List<License> allLicense(){
		return licenseRepository.findAll();
	}
	
	public List<Person> allPersons(){
		return personR.findAll();
	}
	
	public License addLicense(License license) {
		return licenseRepository.save(license);
	}
	
	public Optional<License> getLicense(Long id) {
		return licenseRepository.findById(id);
	}
	
	public static int licenseNumber;

	public static int getLicenseNumber() {
		return licenseNumber;
	}

	public static void setLicenseNumber(int licenseNumber) {
		LicenseService.licenseNumber = licenseNumber;
	}

	public String stringLicenseNumber(int num) {
		String format = String.format("%06d", num);
		return format;
	}
	
	public String generateLicenseNumber() {
		if(licenseRepository.findTopByOrderByNumberDesc().isEmpty()) {
			licenseNumber +=1;
			return stringLicenseNumber(licenseNumber);
		}
		else {
			List<License> top = licenseRepository.findTopByOrderByNumberDesc() ;
			licenseNumber = 1+(Integer.parseInt(top.get(0).getLn()));
			return stringLicenseNumber(licenseNumber);
		}
	}
}