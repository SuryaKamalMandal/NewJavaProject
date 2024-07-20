package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A135_local_html {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Surya-LAPTOP/Desktop/HTML/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("surya");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Hint Box");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("password123");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Surya Kamal");
		
		driver.findElement(By.xpath("(/html/body/form)[2]/input[1]")).click();
		driver.findElement(By.xpath("(/html/body/form)[2]/input[2]")).click();
		driver.findElement(By.xpath("(/html/body/form)[2]/input[3]")).click();
		
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[5]")).click();
		
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("about")).click();
	}
}