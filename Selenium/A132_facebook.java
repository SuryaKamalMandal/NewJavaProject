package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A132_facebook {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abcdefgh");
		driver.findElement(By.name("login")).click();
	}
}