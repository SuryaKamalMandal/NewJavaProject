package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A200_google_retry {
	WebDriver driver; 
	
	@Test(retryAnalyzer = TestNG_Pro.A200_retryanalyzer.class)
	public void search() {
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("qa")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}