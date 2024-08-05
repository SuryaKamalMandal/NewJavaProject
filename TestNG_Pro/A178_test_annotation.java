package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A178_test_annotation {
	
	@Test
	static void login() {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("surya1@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}