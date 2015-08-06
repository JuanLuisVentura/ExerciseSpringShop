package com.accenture.shop.dtos;


public class User {

	private String name;
	private String password;
	private String creditCard;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password
				+ ", creditCard=" + creditCard + "]";
	}
}
