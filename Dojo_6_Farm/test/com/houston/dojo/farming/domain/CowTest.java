package com.houston.dojo.farming.domain;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;


public class CowTest {


	@Test
	public void testCowProduct() {
		Cow cow = new Cow();
		assertTrue(cow.getProduct() instanceof Milk);
		assertEquals(5, cow.getProduct().getAmount());
	}
	
}
