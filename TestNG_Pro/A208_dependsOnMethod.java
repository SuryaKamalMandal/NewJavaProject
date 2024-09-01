package TestNG_Pro;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A208_dependsOnMethod {
	
	@Test
	public void login() {
		
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		
	}
}