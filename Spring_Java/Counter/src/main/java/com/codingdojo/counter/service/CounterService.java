package com.codingdojo.counter.service;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import javax.servlet.http.HttpSession;
@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)

public class CounterService {

	
	private String counter;
	
	public String getCount() {
		return this.counter;
	}
	 
	 
	
		
}
