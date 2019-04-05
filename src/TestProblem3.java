import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestProblem3 {

	@Test
	public void testAdd()
	{
		ShoppingCart cart = new ShoppingCart();
		int count = cart.getItemCount();
		
		cart.addItem(new Product("Cat", 20));
		assertEquals(count + 1, cart.getItemCount());
	}
}
