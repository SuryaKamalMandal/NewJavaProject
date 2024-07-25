package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A152_amazon_keys {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		WebElement drop= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		for(int i=1;i<=10;i++) {
			
			Thread.sleep(500);
			drop.sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Power",Keys.ENTER);
	}
}