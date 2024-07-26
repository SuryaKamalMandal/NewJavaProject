package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A162_google_autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> allsugg= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count= allsugg.size();
		allsugg.get(count-6).click();
	}
}