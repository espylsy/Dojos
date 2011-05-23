package com.houston.dojo.farming.domain;

public class Meat implements Product {

	private int amount;
	
	public Meat(int amount) {
		this.amount = amount;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public int getAmount() {
		return amount;
	}

	@Override
	public String getFormattedText() {
		// TODO Auto-generated method stub
		return "%s kg of meat";
	}

	@Override
	public void addAmount(int amount) {
		this.amount += amount;
	}

}
