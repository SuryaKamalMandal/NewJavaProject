package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A163_amazon_autosuggestion {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		List<WebElement> allsugg= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count= allsugg.size();
		allsugg.get(count-6).click();
	}
}