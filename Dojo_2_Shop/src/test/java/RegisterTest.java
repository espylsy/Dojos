import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class RegisterTest {
	
	private Register cashRegister;
	
	@Before
	public void initializeRegister() {
		cashRegister = new Register();
	}
	
	
	@Test
	public void getTotalPriceReturnsZeroWhenRegisterHasNoProducts(){
		assertTotalPrice(0);
	}
	
	@Test
	public void getTotalPriceReturnsMoreThanZeroWhenRegisterHasOneApple(){
		cashRegister.addProduct(Product.APPLE);
		assertTotalPrice(100);
	}
	
	@Test
	public void getTotalPriceReturns400WhenRegisterHasFiveApples() {
		cashRegister.addProducts(5, Product.APPLE);
		assertTotalPrice(400);
	}
	
	@Test
	public void getTotalPriceReturns500WhenRegisterHasSixApples() {
		cashRegister.addProducts(6, Product.APPLE);
		assertTotalPrice(500);
	}
	
	@Test
	public void getTotalPriceReturns50WhenRegisterHasOneOrange() {
		cashRegister.addProducts(1, Product.ORANGE);
		assertTotalPrice(50);
	}
	@Test
	public void getTotalPriceReturns500WhenRegisterHasElevenOrange() {
		cashRegister.addProducts(11, Product.ORANGE);
		assertTotalPrice(500);
	}
	
	@Test
	public void getTotalPriceReturns900WhenRegisterHasFiveBananas() {
		cashRegister.addProducts(5, Product.BANANA);
		assertTotalPrice(900);
	}
	
	private void assertTotalPrice(int price) {
		assertEquals(price, cashRegister.getTotalPrice());		
	}
}
