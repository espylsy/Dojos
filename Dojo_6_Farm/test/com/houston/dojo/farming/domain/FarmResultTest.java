package com.houston.dojo.farming.domain;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;


public class FarmResultTest {
	
	@Test
	public void testFarmResultOfTwoPigsAndThreeChickens() throws Exception {
		Farm f = new Farm();
		f.addProducers(Pig.class, 2);
		f.addProducers(Chicken.class, 3);
		FarmResult result = f.getFarmResult();
		assertEquals(10, result.getTotalAmount());
	}
	
	@Test
	public void testFarmResultOutputWithTwoPigsAndThreeChickens() throws Exception {
		Farm f = new Farm();
		f.addProducers(Pig.class, 2);
		f.addProducers(Chicken.class, 3);
		FarmResult result = f.getFarmResult();
		assertTrue(result.toString().indexOf("4 kg of meat") != -1);
		assertTrue(result.toString().indexOf("6 eggs") != -1);
		assertTrue(result.toString().indexOf("\n") != -1);
	}
	
	@Test
	public void testFarmResultOutputWithTwoPigsThreeChickensAndFourCows() throws Exception {
		Farm f = new Farm();
		f.addProducers(Pig.class, 2);
		f.addProducers(Chicken.class, 3);
		f.addProducers(Cow.class, 4);
		FarmResult result = f.getFarmResult();
		assertTrue(result.toString().indexOf("4 kg of meat") != -1);
		assertTrue(result.toString().indexOf("6 eggs") != -1);
		assertTrue(result.toString().indexOf("\n") != -1);
		assertTrue(result.toString().indexOf("20 litres of milk") != -1);
	}
}
