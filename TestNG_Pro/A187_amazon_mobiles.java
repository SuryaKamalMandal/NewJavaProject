package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class A187_amazon_mobiles extends A187_bm_am_annotation{

	@Test(priority = 1)
	public void search_mobiles() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
	}
}