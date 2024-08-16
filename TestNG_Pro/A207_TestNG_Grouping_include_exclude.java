package TestNG_Pro;
import org.testng.annotations.Test;

public class A207_TestNG_Grouping_include_exclude {

	@Test(groups = {"smoke","system"})
	public void testCase1() {
		
	}
	@Test(groups = {"smoke"})
	public void testCase2() {
		
	}
	@Test(groups = {"smoke"})
	public void testCase3() {
		
	}
	@Test(groups = {"system"})
	public void testCase4() {
		
	}
}