package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A153_grotechminds_copy_paste {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();

		WebElement present= driver.findElement(By.id("Present-Address"));
		present.sendKeys("Bangalore karnataka");
		present.sendKeys(Keys.CONTROL+"a");
		present.sendKeys(Keys.CONTROL+"c");
		WebElement permanent= driver.findElement(By.id("Permanent-Address"));
		permanent.sendKeys(Keys.CONTROL+"v");
	}
}