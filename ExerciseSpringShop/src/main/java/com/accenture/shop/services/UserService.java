package com.accenture.shop.services;

import com.accenture.shop.dtos.User;

public interface UserService {

	public void login(User user);
	public void logout(User user);
}
