package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A140_grotechminds_payment {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='cardNumber']")).sendKeys("125634982");
		driver.findElement(By.xpath("//input[@id='expiryDate']")).sendKeys("02/28");
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys("601");
		WebElement drop= driver.findElement(By.xpath("//select[@id='cardType']"));
		Select s=new Select(drop);
		s.selectByVisibleText("Mastercard");
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='saveCard']")).click();
	}
}