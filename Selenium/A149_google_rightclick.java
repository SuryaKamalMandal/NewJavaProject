package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A149_google_rightclick {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
		WebElement mail= driver.findElement(By.partialLinkText("Gm"));
		
		Actions a= new Actions(driver);
		a.contextClick(mail).perform();
		Thread.sleep(1000);
	}
}