package TestNG_Pro;

import org.testng.annotations.Test;

public class A191_priority_invocationCount {

	@Test(priority = 2, invocationCount = 3)
	public void testCase1() {
		System.out.println("TestCASE1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("TestCASE2");
	}
}