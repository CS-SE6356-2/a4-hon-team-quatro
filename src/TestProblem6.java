import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;


public class TestProblem6 {
	@Test
	
	public void testAdd()
	{
		ShoppingCart cart = new ShoppingCart();
		Product schnitzel = new Product("Schnitzel on a stick", 9.99);
		//cart.addItem(schnitzel);
		try
		{
			cart.removeItem(schnitzel);
			fail();
		}catch(ProductNotFoundException e)
		{
			assertNotNull(e);
		}
	}
}
