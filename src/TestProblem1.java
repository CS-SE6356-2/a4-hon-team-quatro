import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestProblem1 {
	@Test
	
	public void testAdd()
	{
		ShoppingCart cart = new ShoppingCart();
		
		assertEquals(0,cart.getItemCount());
	}
}
