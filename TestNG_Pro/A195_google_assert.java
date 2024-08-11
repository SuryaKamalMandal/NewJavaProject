package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A195_google_assert {
	WebDriver driver;
	@Test
	public void search() {
		
		String exp= "india - Google Search";
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("india",Keys.ENTER);
		
		Assert.assertEquals(driver.getTitle(), exp,"Sorry the title didnt match");
	}
}