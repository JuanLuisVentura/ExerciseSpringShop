package com.accenture.shop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.accenture.shop.dtos.User;
import com.accenture.shop.services.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("user")
@SessionAttributes({"user"})
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute("user")
	public User populateModelUser() {
	       
		return new User();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		return "login";
	}
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
	public String login(Model model, User user) {
		
		userService.login(user);
		
		model.addAttribute("user", user);
				
		return "index";
	}
	
	@RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
	public String logout(Model model) {
		
		model.addAttribute("user", new User());
		
		return "index";
	}
}
