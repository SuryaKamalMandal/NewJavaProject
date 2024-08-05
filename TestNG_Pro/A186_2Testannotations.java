package TestNG_Pro;

import org.testng.annotations.Test;

public class A186_2Testannotations extends A186_all_annotation {
	
	@Test
	public void testcase() {
		System.out.println("TestCase");
	}
	@Test(priority=1)
	public void testcase2() {
		System.out.println("TestCase 2");
	}
}