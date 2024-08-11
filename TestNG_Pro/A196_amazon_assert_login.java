package TestNG_Pro;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A196_amazon_assert_login {
	WebDriver driver;
	@Test
	public void login() throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet("loginamazon").getRow(0).getCell(0).getStringCellValue();
		String pass= book.getSheet("loginamazon").getRow(0).getCell(1).getStringCellValue();
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		WebElement searchbox= driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(3000);
		Assert.assertEquals(searchbox.isDisplayed(), true, "The Condition didnt matched");
	}
}