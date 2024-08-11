package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A193_facebooklogin_dataprovider {

	@DataProvider(name= "data1")
	public Object datavalue() {
		Object objarr[][]= new Object[2][2];
		objarr[0][0]="surya1@gmail.com";
		objarr[0][1]= "selenium";
		
		objarr[1][0]="suryasurya@gmail.com";
		objarr[1][1]= "seleniumclass";
		return objarr;
	}
	
	@Test(dataProvider = "data1")
	public void fblogin(String un, String pass) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}