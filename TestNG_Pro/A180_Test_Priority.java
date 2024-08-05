package TestNG_Pro;

import org.testng.annotations.Test;

public class A180_Test_Priority {
	@Test(priority=0)
	static void product_search() {
		System.out.println("Searching Product");	
	}
	@Test(priority=1)
	static void product_addcart() {
		System.out.println("Adding to Cart");
	}
}