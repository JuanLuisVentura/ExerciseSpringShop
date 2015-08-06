package com.accenture.shop.services;

import com.accenture.shop.dtos.Basket;
import com.accenture.shop.dtos.Product;
import com.accenture.shop.dtos.User;

public interface ShopService {

	public Basket addProduct(Product product);
	public Basket removeProduct(Product product);
	public Basket viewBasket(User user);
	
}
