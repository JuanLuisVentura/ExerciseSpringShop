package com.accenture.shop.dtos;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	private User user;
	private List<Product> listProduct;
	
	public Basket() {
		this.user = new User();
		this.listProduct = new ArrayList<Product>();
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Product> getListProduct() {
		return listProduct;
	}
	
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	@Override
	public String toString() {
		return "Basket [user=" + user + ", listProduct=" + listProduct + "]";
	}
}
