package com.accenture.shop.controller;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.accenture.shop.dtos.Product;
import com.accenture.shop.dtos.User;
import com.accenture.shop.services.ShopService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("shop")
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Autowired
	private ShopService shop;
	
	private List<Product> listProduts;
	
	@PostConstruct
	private void init() {
		try {
			listProduts = shop.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("listProducts", listProduts);
		
		return "home";
	}
	
	@RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
	public String addProduct(Product product) {
		
		return "home";
	}
	
	@RequestMapping(value = "/remove", method = {RequestMethod.GET, RequestMethod.POST})
	public String removeProduct(Product product) {
		
		return "home";
	}
	
	@RequestMapping(value = "/view", method = {RequestMethod.GET, RequestMethod.POST})
	public String viewBasket(User user) {
		
		return "home";
	}
	
	@RequestMapping(value = "/pay", method = {RequestMethod.GET, RequestMethod.POST})
	public String paymentBasket(User user) {
		
		return "home";
	}
}
