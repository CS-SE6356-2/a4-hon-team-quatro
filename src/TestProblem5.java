import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class TestProblem5 {
	@Test
	
	public void testAdd()
	{
		ShoppingCart cart = new ShoppingCart();
		Product oatmealProduct = new Product("oatmeal", 1.2);
		
		cart.addItem(oatmealProduct);
		int numberBefore = cart.getItemCount();
		cart.removeItem(oatmealProduct);
		int numberAfter = cart.getItemCount();
		
		assertTrue(numberBefore > numberAfter);
	}
}