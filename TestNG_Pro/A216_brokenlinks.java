package TestNG_Pro;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A216_brokenlinks {
	
	@Test
	public static void flipkartbrokenlinks() throws IOException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count= alllinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link= alllinks.get(i);
			String urls=	link.getAttribute("href");
				System.out.println(urls);
				verify_each_link(urls);
		}
		
		
	}
	
	static void verify_each_link(String urls) throws IOException {
	try {		 
			URL u1=new URL(urls);
				HttpURLConnection h1=(HttpURLConnection) u1.openConnection();
			if(h1.getResponseCode()==200)
			{
				System.out.println("It is a valid link &"+ " Response Message is-> "  + h1.getResponseMessage() +" & Response status code is-> " + h1.getResponseCode());
			}
			else
			{
				System.out.println("It is not valid link &" + " Response Message is-> "  + h1.getResponseMessage() +" & Response status code is-> " + h1.getResponseCode());
			}
		}	
	catch(MalformedURLException a1) {
		System.out.println("There was a exception we handled it");
		}
			
	}
}