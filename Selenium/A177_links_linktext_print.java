package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A177_links_linktext_print {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> tags= driver.findElements(By.tagName("a"));
		int count= tags.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			
			WebElement singletag= tags.get(i);
			System.out.println(singletag.getText());
		}
	}
}