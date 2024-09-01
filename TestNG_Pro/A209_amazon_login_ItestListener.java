package TestNG_Pro;
import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Pro.A209_TestNG_ITestListener.class)
public class A209_amazon_login_ItestListener extends A209_TestNG_ITestListener {

	@Test
	public void login_amazon() throws Throwable {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet("loginamazon").getRow(0).getCell(0).getStringCellValue();
		String pass= book.getSheet("loginamazon").getRow(0).getCell(1).getStringCellValue();
		
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
		WebElement idfield= driver.findElement(By.name("email"));
		idfield.sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
	}
}