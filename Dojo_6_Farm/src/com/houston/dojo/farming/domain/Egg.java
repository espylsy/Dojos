package com.houston.dojo.farming.domain;

public class Egg implements Product {

	private int amount;
	
	public Egg(int amount) {
		this.amount = amount;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAmount() {
		return amount;
	}

	@Override
	public String getFormattedText() {
		// TODO Auto-generated method stub
		return "%s eggs";
	}

	@Override
	public void addAmount(int amount) {
		this.amount += amount;
	}

}
