package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A188_CB_google {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void googlesearch(String nameofbrowsers) {
		
		if(nameofbrowsers.equals("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(nameofbrowsers.equals("edge")) {
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}