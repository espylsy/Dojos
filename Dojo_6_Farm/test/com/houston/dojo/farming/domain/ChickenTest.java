package com.houston.dojo.farming.domain;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;


public class ChickenTest {

	@Test
	public void testChickenProduct() {
		Chicken chicken = new Chicken();
		assertTrue(chicken.getProduct() instanceof Egg);
		assertEquals(2, chicken.getProduct().getAmount());
	}
	
}
