package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class A125_launchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}