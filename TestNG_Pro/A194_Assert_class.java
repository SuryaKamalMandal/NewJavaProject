package TestNG_Pro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A194_Assert_class {

	@Test
	public void method1() {
		
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertEquals(false, false);		
	}
}