import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestProblem2 {
	
	@Test
	public void testEmpty()
	{
		ShoppingCart cart = new ShoppingCart();
		cart.empty();
		
		assertEquals(0,cart.getItemCount());
	}
}
