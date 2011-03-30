package com.houston.dojo;

import java.util.HashMap;

public class Cashier {
	
	private HashMap<Product,Integer> products = new HashMap<Product,Integer>();
	
	public Cashier(){
		products.put(Product.APPLE, Integer.valueOf(0));
		products.put(Product.ORANGE,Integer.valueOf(0));
		products.put(Product.BANANA, Integer.valueOf(0));
		products.put(Product.MELON, Integer.valueOf(0));
	}
	
	public void add(Product product) {
		products.put(product, Integer.valueOf(products.get(product) + 1));
	}

	public Double countTotalPrice() {
		
		Double totalPrice = 0.0;
		for (Product p: products.keySet() ) {
			totalPrice += PriceCatalog.countPrice(p, products.get(p));
			
		}
		return totalPrice;		
	}
}
