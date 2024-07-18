package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class A127_close_quit {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
//		driver.quit();
	}
}