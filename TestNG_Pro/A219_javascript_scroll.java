package TestNG_Pro;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A219_javascript_scroll {
	WebDriver driver;
	@Test
	public void scroll_js() throws Throwable {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement about= driver.findElement(By.linkText("About Us"));
		Point loc= about.getLocation();
		int x= loc.getX();
		int y= loc.getY();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-"+y+")");
	}
}