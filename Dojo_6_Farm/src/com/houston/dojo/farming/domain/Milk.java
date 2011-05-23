package com.houston.dojo.farming.domain;

public class Milk implements Product {

	private int amount;
	
	public Milk(int amount) {
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
		return "%s litres of milk";
	}

	@Override
	public void addAmount(int amount) {
		this.amount += amount;
	}

}
