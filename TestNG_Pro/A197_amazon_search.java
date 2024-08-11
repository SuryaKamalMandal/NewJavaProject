package TestNG_Pro;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A197_amazon_search {
	WebDriver driver;
	@Test
	public void search() {
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("shoes",Keys.ENTER);
		List<WebElement> shoes= driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']"));
		
		Assert.assertEquals(shoes.size(), 72, "The total count didnt matched");
	}
}