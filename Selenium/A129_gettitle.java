package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class A129_gettitle {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); 
	}
}