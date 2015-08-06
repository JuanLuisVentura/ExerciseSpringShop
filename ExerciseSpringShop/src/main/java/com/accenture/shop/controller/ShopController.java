package com.accenture.shop.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

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

import com.accenture.shop.dtos.Basket;
import com.accenture.shop.dtos.Product;
import com.accenture.shop.dtos.User;
import com.accenture.shop.services.ShopService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("shop")
@SessionAttributes({"user","basket"})
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Autowired
	private ShopService shop;
	
	private List<Product> listProducts;
	
	@ModelAttribute("basket")
	public Basket populateModelBasket() {
	       
		return new Basket();
	}
	
	@ModelAttribute("user")
	public User populateModelUser() {
	       
		return new User();
	}
	
	@PostConstruct
	private void init() {
		try {
			listProducts = shop.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		model.addAttribute("listProducts", listProducts);
		
		return "index";
	}
	
	@RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody String addProduct(Model model, int idProduct, @ModelAttribute("basket")Basket basket) {
		
		shop.setBasket(basket);
		
		shop.addProduct(idProduct, listProducts);
		
		model.addAttribute("basket", basket);
		
		return "OK";
	}
	
	@RequestMapping(value = "/remove", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody String removeProduct(Model model, int idProduct, @ModelAttribute("basket")Basket basket) {
		
		shop.setBasket(basket);
		
		shop.removeProduct(idProduct);
		
		model.addAttribute("basket", basket);
		
		return "OK";
	}
	
	@RequestMapping(value = "/viewBasket", method = {RequestMethod.GET, RequestMethod.POST})
	public String viewBasket(Model model, @ModelAttribute("user") User user, @ModelAttribute("basket")Basket basket) {
		
		shop.setBasket(basket);
		
		List<Product> listProducts = shop.viewBasket(user);
		
		model.addAttribute("listProducts", listProducts);
		
		return "viewCart";
	}
	
	@RequestMapping(value = "/pay", method = {RequestMethod.GET, RequestMethod.POST})
	public String paymentBasket(User user) {
		
		return "home";
	}
	
	@RequestMapping(value = "/viewProducts", method = RequestMethod.GET)
	public String viewProducts(Model model) {
		
		model.addAttribute("listProducts", listProducts);
		
		return "productList";
	}
}
