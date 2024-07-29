package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A165_pharmeasy_search {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://pharmeasy.in/#searchPopoverOpened");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement searchbox= driver.findElement(By.xpath("(//span[@class='c-kkmdlQ c-kkmdlQ-gatHuX-structure-captionRegular c-kkmdlQ-dYJjti-weight-regular c-kkmdlQ-euWHqW-structure-inputValue c-kkmdlQ-iftOpAg-css'])[2]"));
		searchbox.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("moov");
		Thread.sleep(3000);
		List<WebElement> allsugg= driver.findElements(By.xpath("(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-iieFQlv-css']/div)[2]/a"));
		Thread.sleep(3000);
		int count= allsugg.size();
		System.out.println(count);
		allsugg.get(count-8).click();
	}
}