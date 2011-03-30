package com.houston.dojo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestProduct {

	@Test
	public void appleExists() {
		assertNotNull(Product.APPLE);
	}
	
	@Test
	public void orangeExists() {
		assertNotNull(Product.ORANGE);
	}
	
	@Test
	public void bananaExists() {
		assertNotNull(Product.BANANA);	
	}
	
}
