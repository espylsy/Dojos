package com.houston.dojo.farming.domain;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;


public class PigTest {
	@Test
	public void testPigProduct() {
		Pig pig = new Pig();
		assertTrue(pig.getProduct() instanceof Meat);
		assertEquals(2, pig.getProduct().getAmount());
	}
}
