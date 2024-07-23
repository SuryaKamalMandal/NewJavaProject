package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A145_flipkart_hoverover {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login= driver.findElement(By.xpath("//span[.='Login']"));
//		WebElement login1= driver.findElement(By.xpath("//div[@class='_1TOQfO']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(login).perform();
		
		WebElement profile= driver.findElement(By.xpath("(//li[@class='AT0fUR'])[1]"));
		profile.click();
	}
}