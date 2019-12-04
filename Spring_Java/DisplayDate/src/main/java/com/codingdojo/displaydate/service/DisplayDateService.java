package com.codingdojo.displaydate.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;


@Service
public class DisplayDateService {	
	
	
	public String getDate() {
		return  new SimpleDateFormat("MM.dd.yyyy").format(new Date());
	}
	
	public String getTime() {
		return  new SimpleDateFormat("HH:mm a").format(new Date());
	}
}