
public class Calculator {

	private static final int APPLE_DISCOUNT_PRICE_FOR_FIVE_APPLES = 400;

	public int getDiscountedPrice(Product product, int count) {

		switch(product) {
		case APPLE: return countApples(count);
		case ORANGE: return countOranges(count);
		case BANANA: return countBananas(count);
		default: return 0;
		}
	}
	
	private int countApples(int count) {
		int discountMount = count/5;
		int total = discountMount*APPLE_DISCOUNT_PRICE_FOR_FIVE_APPLES;
		total += (count-discountMount*5)*Product.APPLE.getPriceAsCents();
		return total;
	}
	
	private int countOranges(int count) {
		int discountMount = count/10;
		int total = discountMount*450;
		total += (count-discountMount*10)*Product.ORANGE.getPriceAsCents();
		return total;
	}
	
	private int countBananas(int count) {
		int discountMount = count/3;
		int total = discountMount*500;
		total += (count-discountMount*3)*Product.BANANA.getPriceAsCents();
		return total;
	}

}
