package com.accenture.shop.services;

import java.io.IOException;
import java.util.List;

import com.accenture.shop.dtos.Basket;
import com.accenture.shop.dtos.Product;
import com.accenture.shop.dtos.User;

public interface ShopService {

	public List<Product> load() throws IOException;
	public void setBasket(Basket basket);
	public Basket addProduct(int idProduct, List<Product> listProduts);
	public Basket removeProduct(int idProduct);
	public Basket viewBasket(User user);
	
}
