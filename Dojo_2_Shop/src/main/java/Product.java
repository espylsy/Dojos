public enum Product {

	APPLE (100), 
	ORANGE (50), 
	BANANA (200);

	private final int priceAsCents;

	Product(int priceAsCents) {
		this.priceAsCents = priceAsCents;
	}

	public int getPriceAsCents() {
		return this.priceAsCents;
	}
}