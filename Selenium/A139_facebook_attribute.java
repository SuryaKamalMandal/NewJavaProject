package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A139_facebook_attribute {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("surya@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}