package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class A128_getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.close();
	}
}