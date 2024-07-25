package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A160_grotechminds_fileupload {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("Surya Kamal");
		driver.findElement(By.id("lname")).sendKeys("Mandal");
		driver.findElement(By.id("email")).sendKeys("suryamandal99@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("Present-Address")).sendKeys("Bangalore");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Bangalore");
		driver.findElement(By.id("Pincode")).sendKeys("713213");
		driver.findElement(By.id("relocate")).click();
		WebElement skill= driver.findElement(By.id("Skills"));
		Select s= new Select(skill);
		s.selectByVisibleText("Technical Skills");
		
		WebElement country= driver.findElement(By.id("Country"));
		Select s1= new Select(country);
		s1.selectByVisibleText("India ");
		
		WebElement religion= driver.findElement(By.id("Relegion"));
		Select s2= new Select(religion);
		s2.selectByVisibleText("Hindu");
		
		WebElement upload= driver.findElement(By.id("file"));
		upload.sendKeys("C:\\Users\\Surya-LAPTOP\\Desktop\\MKT\\learningHTML1.html");
		
	}
}