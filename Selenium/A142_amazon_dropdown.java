package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A142_amazon_dropdown {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement drop= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s=new Select(drop);
		s.selectByVisibleText("Books");
	}
}