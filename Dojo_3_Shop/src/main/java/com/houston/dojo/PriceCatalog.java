package com.houston.dojo;

import java.util.HashMap;
import java.util.Map;

import com.sun.tools.javac.util.Pair;

public class PriceCatalog {
	
	private static Map<Product, Double> productPrices = new HashMap<Product, Double>();
	private static Map<Product, Pair<Integer,Double>> discountPrices = new HashMap<Product, Pair<Integer,Double>>(); 
	static {
		productPrices.put(Product.APPLE, 1.0);
		productPrices.put(Product.BANANA, 0.7);
		productPrices.put(Product.ORANGE, 0.5);
		productPrices.put(Product.MELON, 2.00);
		
		discountPrices.put(Product.ORANGE, new Pair<Integer,Double>(10,4.00));	
		discountPrices.put(Product.APPLE, new Pair<Integer,Double>(5,4.00));	
		discountPrices.put(Product.BANANA, new Pair<Integer,Double>(3,2.00));
		discountPrices.put(Product.MELON, new Pair<Integer,Double>(3,5.00));
		}
	
	
	public static Double countPrice(Product product, int count) {
		Pair<Integer,Double> discount = discountPrices.get(product);
		if (discount != null) {
			int discountQuantity = discount.fst;
			Double singlePrice = (count % discountQuantity) * productPrices.get(product);
			Double discountPrice = ((count - (count % discountQuantity) ) / discountQuantity) * discount.snd;
			return singlePrice + discountPrice;
		}
		return productPrices.get(product) * count;
	}

}
