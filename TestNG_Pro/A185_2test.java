package TestNG_Pro;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A185_2test {

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	@Test
	public void testcase1() {
		System.out.println("Testcase1");
	}
	@Test
	public void testcase2() {
		System.out.println("TestCASE2");
	}
	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}
}