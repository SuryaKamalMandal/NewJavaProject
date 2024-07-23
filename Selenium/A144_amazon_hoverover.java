package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A144_amazon_hoverover {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement account=	driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a=new Actions(driver);
		a.moveToElement(account).perform();
		WebElement sign= driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		sign.click();
	}
}