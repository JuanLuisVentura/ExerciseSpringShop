package com.accenture.shop.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.accenture.shop.dtos.Basket;
import com.accenture.shop.dtos.Product;
import com.accenture.shop.dtos.User;

@Component
public class ShopServiceImpl implements ShopService {

	private static final String DIRECTORY = "C:\\environment\\ide\\eclipse-jee\\products.txt";
	
	private Basket basket;
	
	@Override
	public List<Product> load() throws IOException {
		
		List<Product> list = new ArrayList<Product>();
		
		try {
			FileReader file = new FileReader(DIRECTORY);
		
			BufferedReader br = new BufferedReader(file);
	        String line;
	        
			while((line = br.readLine()) != null) {
	            String[] split = line.split("#");
	            list.add(new Product(Integer.parseInt(split[0]), split[1], Float.parseFloat(split[2])));
	        }
			
	        br.close();
		} catch (IOException e) {
			throw e;
		}
		
		return list;
	}
	
	@Override
	public Basket addProduct(Product product) {
		
		if (basket == null) {
			basket = new Basket();
		}
		
		basket.getListProduct().add(product);
		
		return basket;
	}

	@Override
	public Basket removeProduct(Product product) {
		
		List<Product> listProduct = basket.getListProduct();
		
		for (int i=0; i<=listProduct.size(); i++) {
			if (listProduct.get(i).getId() == product.getId()) {
				basket.getListProduct().remove(i);
			}
		}
		
		return basket;
	}

	@Override
	public Basket viewBasket(User user) {
		
		if (basket.getUser().equals(user)) {
			return basket;
		}
		
		return null;
	}

}
