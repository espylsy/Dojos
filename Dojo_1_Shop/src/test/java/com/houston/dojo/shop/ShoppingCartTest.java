package com.houston.dojo.shop;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import com.houston.dojo.shop.stock.Fruit;

public class ShoppingCartTest {
	
	@Test
	public void shouldCalculateFruitPriceForOneOrange() {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addFruit(Fruit.ORANGE);
		assertEquals(0.5, cart.getTotal());
	}
	
	@Test
	public void shouldCalculateFruitPriceForOrangeAndBanana() {
		ShoppingCart cart = new ShoppingCart();
		cart.addFruit(Fruit.ORANGE);
		cart.addFruit(Fruit.BANANA);
		assertEquals(2.5, cart.getTotal());
	}

	@Test
	public void shouldCalculateFruitPriceForOrangeAndBananaAndApple() {
		ShoppingCart cart = new ShoppingCart();
		cart.addFruit(Fruit.ORANGE);
		cart.addFruit(Fruit.BANANA);
		cart.addFruit(Fruit.APPLE);
		assertEquals(3.5, cart.getTotal());
	}

	@Test
	public void shouldCalculateFruitPriceForFourApple() {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addFruit(Fruit.APPLE);
		cart.addFruit(Fruit.APPLE);
		cart.addFruit(Fruit.APPLE);
		cart.addFruit(Fruit.APPLE);
		assertEquals(3.0, cart.getTotal());
	}
	

}
