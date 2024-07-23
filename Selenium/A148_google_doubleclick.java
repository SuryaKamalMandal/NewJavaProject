package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A148_google_doubleclick {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
		WebElement mail= driver.findElement(By.partialLinkText("Gm"));
		
		Actions a= new Actions(driver);
		a.doubleClick(mail).perform();
	}
}