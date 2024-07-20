package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A136_grotechmind_website {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[1]/div/input")).sendKeys("Surya Kamal");
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[1]/div[2]/input")).sendKeys("Mandal");
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[2]/div/input")).sendKeys("suryamandal99@gmail.com");
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[2]/div[2]/input")).sendKeys("password");
		
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[3]/div/div/div/div/input[1]")).click();
		
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[5]/div/textarea[1]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[5]/div[2]/textarea")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[6]/div/input")).sendKeys("713213");
		
		driver.findElement(By.xpath("(((((/html/body/div)[2]/div)[2]/div/div)[3]/div/div)[2]/div/div/form/div)[7]/div[2]/div/input")).click();
	}
}