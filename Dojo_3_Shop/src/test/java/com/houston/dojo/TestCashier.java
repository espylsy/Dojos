package com.houston.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCashier {
	
	Cashier cashier; 
	
	@Before
	public void setUp(){
		cashier = new Cashier();
	}
	
	private void addProducts(Product product, int count) {
		for (int i = 0; i < count; i++) {
			cashier.add(product);
		}
	}
	
	@Test
	public void testCountTotalPriceOfEmptyBasket() {
		assertEquals(new Double(0), cashier.countTotalPrice());
	}
	
	@Test
	public void testCountTotalPriceOfOneApple() {
		cashier.add(Product.APPLE);
		assertEquals(new Double(1), cashier.countTotalPrice());
	}
	
	@Test
	public void testCountTotalPriceOfTwoApples() {
		cashier.add(Product.APPLE);
		cashier.add(Product.APPLE);
		assertEquals(new Double(2), cashier.countTotalPrice());
	}
	
	@Test
	public void testCountTotalPriceOfAppleAndOrange() {
		cashier.add(Product.APPLE);
		cashier.add(Product.ORANGE);
		assertEquals(Double.valueOf(1.5), cashier.countTotalPrice());
	}
	
	@Test
	public void testCountTotalPriceOfTwoBananas() {
		cashier.add(Product.BANANA);
		cashier.add(Product.BANANA);
		assertEquals(Double.valueOf(1.4), cashier.countTotalPrice());
	}

	@Test
	public void testCountTotalPriceOfTenOranges() {
		addProducts(Product.ORANGE, 10);
		
		assertEquals(Double.valueOf(4.0), cashier.countTotalPrice());
	}
	

	@Test
	public void testCountTotalPriceOfTenApples() {
		addProducts(Product.APPLE, 5);
		
		assertEquals(Double.valueOf(4.0), cashier.countTotalPrice());
	}
	

	@Test
	public void testCountTotalPriceOfTenBananas() {
		addProducts(Product.BANANA, 3);
		
		assertEquals(Double.valueOf(2.0), cashier.countTotalPrice());
	}
	
	@Test
	public void testCountTotalPriceOfTenMelons() {
		addProducts(Product.MELON, 10);
		
		assertEquals(Double.valueOf(17.0), cashier.countTotalPrice());
	}
	
}
