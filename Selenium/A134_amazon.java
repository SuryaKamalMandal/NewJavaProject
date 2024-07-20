package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A134_amazon {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Customer")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Mobiles")).click();

	}
}