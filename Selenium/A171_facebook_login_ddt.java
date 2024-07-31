package Selenium;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A171_facebook_login_ddt {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet("facebook").getRow(1).getCell(1).getStringCellValue();
		String pwd= book.getSheet("facebook").getRow(2).getCell(1).getStringCellValue();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}