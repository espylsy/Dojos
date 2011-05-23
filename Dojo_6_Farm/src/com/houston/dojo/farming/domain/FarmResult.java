package com.houston.dojo.farming.domain;

import java.util.HashSet;
import java.util.Set;

import static java.lang.String.*;

public class FarmResult {

	private Set<Product> products = new HashSet<Product>();
	
	public FarmResult() {
		
	}
	
	public void addProduct(Product product) {
		Product p = getProduct(product.getClass());
		if (p != null) {
			p.addAmount(product.getAmount());
		} else {
			products.add(product);
		}
	}
	
	private Product getProduct(Class productClass) {
		for (Product p : products) {
			if (p.getClass().equals(productClass)) return p;
		}
		return null;
		
	}

	public int getTotalAmount() {
		int total = 0;
		for (Product p : products) {
			total += p.getAmount();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Product p : products) {
			sb.append(format(p.getFormattedText(), p.getAmount())).append("\n");
		}
		return sb.toString();
	}
	
}
