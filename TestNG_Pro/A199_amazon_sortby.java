package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class A199_amazon_sortby {
	WebDriver driver;
	@Test
	public void sortby() throws Throwable {
		
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Fashion")).click();
		Thread.sleep(2000);
		WebElement men= driver.findElement(By.xpath("//span[.='Men']"));
		Actions a= new Actions(driver);
		a.moveToElement(men).perform();
		Thread.sleep(2000);
		WebElement tshirt= driver.findElement(By.linkText("T-Shirts"));
		tshirt.click();
		Thread.sleep(2000);
		WebElement sort= driver.findElement(By.xpath("//div[.='Newest First']"));
		sort.click();
	}
}