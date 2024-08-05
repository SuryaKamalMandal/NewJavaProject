package TestNG_Pro;

import org.testng.annotations.Test;

public class A182_enabled_test {

	@Test
	public void testcase1() {
		System.out.println("Testcase1");
	}
	@Test(enabled=false)
	public void testcase2() {
		System.out.println("TestCase2");
	}
}