package com.houston.dojo.farming.domain;

import java.util.List;

import static junit.framework.Assert.*;

import org.junit.Test;


public class FarmTest {
	

	@Test
	public void testEmptyFarm() {
		Farm farm = new Farm();
		assertEquals(0, farm.getProducers().size());
	}

	@Test
	public void testFarmWithOnePig() {
		Farm farm = new Farm();
		farm.addProducer(new Pig());
		List<Product> products = farm.getProducts();
		assertEquals(1, farm.getProducers().size());
		assertEquals(1, products.size());
		
	}

	@Test
	public void testFarmWithOneChicken() {
		Farm farm = new Farm();
		farm.addProducer(new Chicken());
		List<Product> products = farm.getProducts();
		assertEquals(1, farm.getProducers().size());
		assertEquals(1, products.size());
	}

	@Test
	public void testFarmWithOneCow() {
		Farm farm = new Farm();
		farm.addProducer(new Cow());
		List<Product> products = farm.getProducts();
		assertEquals(1, farm.getProducers().size());
		assertEquals(1, products.size());
	}

	@Test
	public void testFarmWithOneChickenAndOnePig() {
		Farm farm = new Farm();
		farm.addProducer(new Chicken());
		farm.addProducer(new Pig());
		List<Product> products = farm.getProducts();
		assertEquals(2, farm.getProducers().size());
		assertEquals(2, products.size());
	}
		
	@Test
	public void testNumberOfProducersWithTwoPigsAndThreeChickens() throws Exception {
		Farm f = new Farm();
		f.addProducers(Pig.class, 2);
		f.addProducers(Chicken.class, 3);
		assertEquals(5, f.getProducers().size());
	}
	
}
