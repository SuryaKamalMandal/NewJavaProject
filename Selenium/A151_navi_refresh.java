package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A151_navi_refresh {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Surya Kamal");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Mandal");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("suryamandal99@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//textarea[@id='Present-Address']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//textarea[@id='Permanent-Address']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//textarea[@id='Permanent-Address']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='Pincode']")).sendKeys("713213");
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}