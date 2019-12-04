package com.codingdojo.survey.service;

import org.springframework.stereotype.Service;

@Service
public class SurveyService {
	
	private String name;
	private String location;
	private String language;
	private String comment;
	
	
	//getters
	
	public String getName() {
		return name;
	}


	public String getLocation() {
		return location;
	}


	public String getLanguage() {
		return language;
	}


	public String getComment() {
		return comment;
	}
	
	
	public void proccess(String name,String location,String language,String comment) {
		this.name = name;
		this.location = location;
		this.language = language;
		this.comment = comment;
	}
	
}
