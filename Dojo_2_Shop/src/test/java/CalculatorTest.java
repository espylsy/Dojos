import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
	private Calculator calculator = new Calculator();
	
	@Test
	public void getDiscountedPriceForFourApples() {
		int price = calculator.getDiscountedPrice(Product.APPLE, 4);
		assertEquals(400, price);
	}
	
 
}
