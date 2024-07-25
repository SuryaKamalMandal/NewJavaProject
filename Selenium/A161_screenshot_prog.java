package Selenium;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A161_screenshot_prog {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts= driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg= new File("C:\\Users\\Surya-LAPTOP\\Desktop\\MKT\\screenshots\\google"+Math.random()+".png");
		FileHandler.copy(src, trg);
	}
}