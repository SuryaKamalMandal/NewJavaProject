package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A154_google_sugg {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("India");
		
		for(int i=1;i<=4;i++) {
			
			Thread.sleep(500);
			search.sendKeys(Keys.ARROW_DOWN);
			
		}
		search.sendKeys(Keys.ENTER);
	}
}