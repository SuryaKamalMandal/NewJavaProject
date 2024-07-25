package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A157_google_isEnabled_isDisplayed {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
		WebElement mail= driver.findElement(By.partialLinkText("Gm"));
		
		if(mail.isEnabled() && mail.isDisplayed()) {
			
			mail.click();
		}
	}
}