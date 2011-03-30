package com.houston.dojo.shop.stock;

public enum Fruit {
	ORANGE (0.5), 
	BANANA (2), 
	APPLE (1);

	
	private double price;
	
	
	private Fruit(double price) {
		this.price = price;
	}
	
	public double getPrice() {			
		
		return price;
		
	}
	
}
