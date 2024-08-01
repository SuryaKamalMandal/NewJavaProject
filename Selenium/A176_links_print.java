package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A176_links_print {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks= driver.findElements(By.tagName("a"));
		int count= alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			
				WebElement links= alllinks.get(i);
				String attribute= links.getAttribute("href");
				System.out.println(attribute);
		}
	}
}