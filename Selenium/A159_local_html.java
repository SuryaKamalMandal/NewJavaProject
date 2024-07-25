package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A159_local_html {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Surya-LAPTOP/Desktop/MKT/learningHTML1.html");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement fname= driver.findElement(By.name("fname"));
		fname.sendKeys("SuryaKamal");
	}
}