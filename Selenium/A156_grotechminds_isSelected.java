package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A156_grotechminds_isSelected {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement radio= driver.findElement(By.id("male"));
		radio.click();
		Thread.sleep(500);
		System.out.println(radio.isSelected());	
	}
}