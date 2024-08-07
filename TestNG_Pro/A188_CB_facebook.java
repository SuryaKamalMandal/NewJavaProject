package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A188_CB_facebook {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void fblogin(String nameofbrowsers) {
		
		if(nameofbrowsers.equals("chrome")) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(nameofbrowsers.equals("edge")) {
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("surya@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}