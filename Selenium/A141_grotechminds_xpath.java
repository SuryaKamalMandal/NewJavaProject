package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A141_grotechminds_xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Surya");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("Mandal");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Kamal");
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//textarea)[2]")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("suryamandal99@gmail.com");
		driver.findElement(By.xpath("(//input)[6]")).sendKeys("suryamandal99@gmail.com");
		driver.findElement(By.xpath("(//input)[7]")).sendKeys("9475514014");
		
//		driver.findElement(By.xpath("(//button)[2]")).click();
	}
}