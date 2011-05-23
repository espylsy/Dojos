package com.houston.dojo.farming.domain;

public interface Product {
	
	public String getName();
	public int getAmount();
	public String getFormattedText();
	public void addAmount(int amount);

}
