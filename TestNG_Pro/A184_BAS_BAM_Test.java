package TestNG_Pro;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class A184_BAS_BAM_Test {
	
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}
	@Test
	public void TestCase() {
		System.out.println("TestCase");
	}
	@AfterMethod
	public void af() {
		System.out.println("After Method");
	}
	@AfterSuite
	public void as() {
		System.out.println("After Suite");
	}
}