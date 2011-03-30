import java.util.HashMap;
import java.util.Map;


public class Register {

	private final Map<Product, Integer> productToAmount = new HashMap<Product, Integer>();
	
	public Register() {
		for (Product product : Product.values()) {
			this.productToAmount.put(product, 0);	
		}
	}
	
	public void addProduct(Product product) {
		addToProducts(product, 1);
	}

	public int getTotalPrice() {
		int totalPrice = 0;
		Calculator calculator = new Calculator();
		for (Product product : productToAmount.keySet()) {
			totalPrice += calculator.getDiscountedPrice(product, productToAmount.get(product));
		}
		return totalPrice;	
	}

	public void addProducts(int amount, Product product) {
		addToProducts(product, amount);
	}

	private void addToProducts(Product product, int amount) {
		productToAmount.put(product, productToAmount.get(product) + amount);
	}
}
