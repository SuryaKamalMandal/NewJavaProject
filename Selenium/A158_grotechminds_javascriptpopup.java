package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A158_grotechminds_javascriptpopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		WebElement button= driver.findElement(By.xpath("//button[.='Click ']"));
		button.click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}
}