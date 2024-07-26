package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A164_bank_website {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		driver.findElement(By.id("username")).sendKeys("surya");
		driver.findElement(By.name("password")).sendKeys("password");
	}
}