package TestNG_Pro;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A189_amazon_frame {
	WebDriver driver;
	@Test
	public void amazonframe() throws Throwable {
		
		driver= new ChromeDriver();
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
		driver.findElement(By.id("submit.add-to-cart")).click();
//		driver.close();
	}
}