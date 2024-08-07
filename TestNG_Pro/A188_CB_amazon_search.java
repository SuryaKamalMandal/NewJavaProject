package TestNG_Pro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A188_CB_amazon_search {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void amazonsearch(String nameofbrowsers) {
		
		if(nameofbrowsers.equals("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(nameofbrowsers.equals("edge")) {
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}
}