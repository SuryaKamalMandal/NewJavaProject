package TestNG_Pro;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A192_googlesearch_dataprovider {
	
	@DataProvider(name="data1")
	public Object[][] datavalues() {
		
		return new Object[][] {{"India"},{"Cricket"},{"Olypics"},{"Bangladesh"},{"Stock Market"},{"US Market"},{"RBI Policy"},{"Modi"},{"War"},{"HP"},};
		
	}
	
	@Test(dataProvider = "data1")
	public void search(String input) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys(input);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}	
}