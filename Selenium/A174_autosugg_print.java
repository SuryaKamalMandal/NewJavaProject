package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A174_autosugg_print {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		Thread.sleep(2000);
		List<WebElement> allsugg= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count= allsugg.size();
//		allsugg.get(count-6).click();
		
		for(int i=0;i<count;i++) {
			WebElement sugg= allsugg.get(i);
			System.out.println(sugg.getText());
		}

	}
}