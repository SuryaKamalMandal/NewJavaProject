package Selenium;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A167_amazon_parentchild {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes",Keys.ENTER);
		WebElement result= driver.findElement(By.xpath("((//span[@class='rush-component'])/a/div)[1]"));
		result.click();
		Thread.sleep(2000);
		Set<String> allid= driver.getWindowHandles();
		Iterator<String> id= allid.iterator();
		String parentid= id.next();
		String childid= id.next();
		
		driver.switchTo().window(childid);
		driver.close();
	}
}