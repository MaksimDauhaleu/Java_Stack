package com.dauhaleu.lookify.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dauhaleu.lookify.models.User;
import com.dauhaleu.lookify.services.LookifyService;



@Controller
public class UserController {
 private final LookifyService lookifyService;

 
 public UserController(LookifyService userService) {
     this.lookifyService = userService;
 }

 
 //Regist
 @RequestMapping("/regist")
 public String registerForm(@ModelAttribute("user") User user) {
     return "registrationPage.jsp";
 }
 @RequestMapping("/login")
 public String login() {
     return "loginPage.jsp";
 }
 
 
 //Regist
 @RequestMapping(value="/registration", method=RequestMethod.POST)
 public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
	 if(!user.getPassword().equals(user.getPasswordConfirmation())) {
		 result.rejectValue("passwordConfirmation", "error.user","Password confirmation is failed");
		 return "registrationPage.jsp";
	 }
	 if(result.hasErrors()) {
		 result.rejectValue("password", "error.user","Try again");
		 return"registrationPage.jsp";
	 }
	 if(lookifyService.findByEmail(user.getEmail()) != null){
		 result.rejectValue("email", "error.user","Email exist");
		 return "registrationPage.jsp";
	 }else {
		 User some = new User(user);
		 lookifyService.registerUser(some);
		 return "redirect:/login";
	 }
 }
 
 //Login
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    	Boolean user = lookifyService.authenticateUser(email, password);
    	if(user == true) {
    		User test = lookifyService.findByEmail(email);
    		session.setAttribute("id", test.getId());
    		session.setAttribute("loggedIn", true);
    		return "redirect:/";
    	}else {
    		String error = "Please make sure that you have entered your login and password correctly.";
    		model.addAttribute("error",error);
    		return "loginPage.jsp";
    	}
 }

 	
 
 


 



 
 
 //LogOut
 @RequestMapping("/logout")
 public String logout(HttpSession session) {
	 session.invalidate();
	 return"redirect:/login";
 }
}