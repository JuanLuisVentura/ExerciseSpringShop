package com.accenture.shop.services;

import org.springframework.stereotype.Component;

import com.accenture.shop.dtos.Basket;
import com.accenture.shop.dtos.Product;
import com.accenture.shop.dtos.User;

@Component
public class ShopServiceImpl implements ShopService {

	private Basket basket;
	
	@Override
	public Basket addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket removeProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Basket viewBasket(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
