package Selenium;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A168_naukri_reg {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Google']")).click();
		Thread.sleep(3000);
		Set<String> allid= driver.getWindowHandles();
		Iterator<String> id= allid.iterator();

		driver.close();
	}
}