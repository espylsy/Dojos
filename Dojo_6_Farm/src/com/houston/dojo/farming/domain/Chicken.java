package com.houston.dojo.farming.domain;

public class Chicken implements Producer {

	@Override
	public Product getProduct() {
		return new Egg(2);
	}

}
