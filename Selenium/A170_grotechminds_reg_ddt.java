package Selenium;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A170_grotechminds_reg_ddt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String fname= book.getSheet("reg_form").getRow(1).getCell(1).getStringCellValue();
		String lname= book.getSheet("reg_form").getRow(2).getCell(1).getStringCellValue();
		String email= book.getSheet("reg_form").getRow(3).getCell(1).getStringCellValue();
		String fno= NumberToTextConverter.toText(book.getSheet("reg_form").getRow(4).getCell(1).getNumericCellValue());
		String aadhar= NumberToTextConverter.toText(book.getSheet("reg_form").getRow(5).getCell(1).getNumericCellValue());
		String aadhar1= NumberToTextConverter.toText(book.getSheet("reg_form").getRow(5).getCell(2).getNumericCellValue());
		String pan= book.getSheet("reg_form").getRow(6).getCell(1).getStringCellValue();
		String gender= book.getSheet("reg_form").getRow(7).getCell(1).getStringCellValue();
		String statevalue= book.getSheet("reg_form").getRow(8).getCell(1).getStringCellValue();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys(fname);
		driver.findElement(By.xpath("(//input)[3]")).sendKeys(lname);
		driver.findElement(By.xpath("(//input)[4]")).sendKeys(email);
		driver.findElement(By.xpath("(//input)[5]")).sendKeys(fno);
		WebElement gen= driver.findElement(By.id("gender"));
		Select s=new Select(gen);
		s.selectByVisibleText(gender);
		WebElement state= driver.findElement(By.id("state"));
		Select s1=new Select(state);
		s1.selectByVisibleText(statevalue);
		driver.findElement(By.xpath("(//input)[6]")).sendKeys(aadhar,aadhar1);
		driver.findElement(By.xpath("(//input)[7]")).sendKeys(pan);
		driver.findElement(By.xpath("(//input)[8]")).click();
		
//		driver.findElement(By.xpath("(//button)[2]")).click();
	}
}