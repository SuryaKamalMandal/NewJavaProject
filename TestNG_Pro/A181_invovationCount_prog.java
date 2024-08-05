package TestNG_Pro;

import org.testng.annotations.Test;

public class A181_invovationCount_prog {

	@Test(invocationCount = 2)
	public void one_method() {
		
		System.out.println("TestCASE");
	}
}