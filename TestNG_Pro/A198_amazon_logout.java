package TestNG_Pro;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A198_amazon_logout {
	WebDriver driver;
	@Test
	public void logout() throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet("loginamazon").getRow(0).getCell(0).getStringCellValue();
		String pass= book.getSheet("loginamazon").getRow(0).getCell(1).getStringCellValue();
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		Thread.sleep(2000);
		WebElement idfield= driver.findElement(By.name("email"));
		idfield.sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		WebElement acc= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a= new Actions(driver);
		a.moveToElement(acc).perform();
		WebElement logout= driver.findElement(By.xpath("//span[.='Sign Out']"));
		logout.click();
		Thread.sleep(3000);

		WebElement idfield1= driver.findElement(By.name("email"));
		Assert.assertEquals(idfield1.isDisplayed(), true, "Sorry, the T.C is Failed");
	}
}