package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A137_grotechmind_webform {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Surya Kamal");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Mandal");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("suryamandal99@gmail.com");
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("9475514014");
		driver.findElement(By.xpath("(//input)[6]")).sendKeys("401467644150");
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("CUGPM3062C");
		driver.findElement(By.xpath("(//input)[8]")).click();
		
		driver.findElement(By.xpath("(//button)[2]")).click();
	}
}