package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class A187_amazon_shoes extends A187_bm_am_annotation{

	@Test
	public void search_shoes() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes",Keys.ENTER);
	}
}