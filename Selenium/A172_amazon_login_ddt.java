package Selenium;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class A172_amazon_login_ddt {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		String un= book.getSheet("amazon").getRow(1).getCell(1).getStringCellValue();
		String pwd= book.getSheet("amazon").getRow(2).getCell(1).getStringCellValue();
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fprimeday%2F%26ref_%3Dnav_signin%3F_encoding%3DUTF8%26ref_%3Dnav_signin%26pf_rd_p%3D0ef7df89-1ac5-481d-aa30-3f0f95cd5147%26pf_rd_s%3Dnav-sitewide-msg%26pf_rd_t%3D4201%26pf_rd_i%3Dnavbar-4201%26pf_rd_m%3DA21TJRUUN4KGV%26pf_rd_r%3DGKZNFE9GDDZQRN9SJKEK%26discounts-widget%3D%252522%25257B%25255C%252522state%25255C%252522%25253A%25257B%25255C%252522refinementFilters%25255C%252522%25253A%25257B%25257D%25257D%25252C%25255C%252522version%25255C%252522%25253A1%25257D%252522&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[7]")).sendKeys(un);
		driver.findElement(By.xpath("(//input)[10]")).click();
		
		driver.findElement(By.xpath("(//input)[9]")).sendKeys(pwd);
		driver.findElement(By.xpath("(//input)[10]")).click();
	}
}