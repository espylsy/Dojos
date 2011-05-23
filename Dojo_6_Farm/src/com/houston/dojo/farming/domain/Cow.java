package com.houston.dojo.farming.domain;

public class Cow implements Producer {

	@Override
	public Product getProduct() {
		return new Milk(5);
	}

}
