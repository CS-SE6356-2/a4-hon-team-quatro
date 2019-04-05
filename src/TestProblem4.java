import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem4 {
	@Test
	
	public void testBalance()
	{
		ShoppingCart cart = new ShoppingCart();
		double initialBalance = cart.getBalance();
		
		double cost = 10;
		Product product = new Product("Test Product", cost);
		
		cart.addItem(product);
		
		assertEquals(initialBalance+cost, cart.getBalance(), 0);
	}
}
