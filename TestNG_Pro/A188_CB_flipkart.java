package TestNG_Pro;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A188_CB_flipkart {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void flipkartsearch(String nameofbrowsers) throws Throwable {
		
		if(nameofbrowsers.equals("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(nameofbrowsers.equals("edge")) {
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> allsugg= driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count= allsugg.size();
		
		allsugg.get(count-8).click();
	}
}