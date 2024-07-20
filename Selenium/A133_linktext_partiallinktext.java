package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A133_linktext_partiallinktext {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gm")).click();
		driver.close();
	}
}