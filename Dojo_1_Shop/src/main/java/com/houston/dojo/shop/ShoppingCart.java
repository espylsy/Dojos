package com.houston.dojo.shop;

import java.util.ArrayList;
import java.util.List;

import com.houston.dojo.shop.stock.Fruit;

public class ShoppingCart {
	
	private List<Fruit> fruits = new ArrayList<Fruit>();

	public void addFruit(Fruit fruit) {
		fruits.add(fruit);
	}

	public double getTotal() {
		double total = 0;
		for(Fruit fruit : fruits) {
			total += fruit.getPrice();
		}
		total -= getDiscount();
		return total;
	}

	private double getDiscount() {
		return new DiscountCalculator(fruits).calculate();
		if (fruits.size() == 4) {
			return 1.0;
		}
		return 0.0;
	}
}
