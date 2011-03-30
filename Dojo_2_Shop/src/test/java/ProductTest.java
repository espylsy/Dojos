import static org.junit.Assert.*;

import org.junit.Test;

public class ProductTest {
	
	@Test
	public void productHasType() {
		assertNotNull(Product.APPLE);
	}
	
	@Test
	public void productHasPrice() {
		assertEquals("Prices should match.", 100, Product.APPLE.getPriceAsCents());
	}
}
