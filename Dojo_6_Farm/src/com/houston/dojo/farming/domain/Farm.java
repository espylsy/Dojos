package com.houston.dojo.farming.domain;

import java.util.ArrayList;
import java.util.List;

public class Farm {

	private List<Producer> producers = new ArrayList<Producer>();
	
	public Farm() {
	}
	
	public void addProducers(Class<? extends Producer> producerClass, int numberofProducers) throws Exception {
		for (int i = 0; i < numberofProducers; i++) {
			this.addProducer(producerClass.newInstance());
		}
	}

	public List<Producer> getProducers() {
		return producers;
		
	}
	
	public void addProducer(Producer producer) {
		producers.add(producer);
	}

	public List<Product> getProducts() {
		List<Product> result = new ArrayList<Product>();
		for (Producer producer : producers) {
			result.add(producer.getProduct());
		}
		return result;
	}

	public FarmResult getFarmResult() {
		FarmResult result = new FarmResult();
		List<Product> products = getProducts();
		for (Product p : products) {
			result.addProduct(p); 
			
		}
		return result;
	}

	
	
	

}
