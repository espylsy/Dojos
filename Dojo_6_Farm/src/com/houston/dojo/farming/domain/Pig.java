package com.houston.dojo.farming.domain;

public class Pig implements Producer {

	@Override
	public Product getProduct() {
		return new Meat(2);
	}
	
	

}
