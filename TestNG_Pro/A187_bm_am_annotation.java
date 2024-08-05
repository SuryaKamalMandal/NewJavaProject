package TestNG_Pro;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class A187_bm_am_annotation {
	ChromeDriver driver;
	@BeforeMethod
	public void launch() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}