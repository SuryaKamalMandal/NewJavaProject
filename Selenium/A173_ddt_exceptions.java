package Selenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class A173_ddt_exceptions {

	public static void main(String[] args) throws Throwable {

		try {
		FileInputStream fis= new FileInputStream("D:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		String mob_no= NumberToTextConverter.toText(book.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
		System.out.println(mob_no);
		}
		catch(FileNotFoundException f) {
			System.out.println("Check your path");
		}

		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			String empty_value= book.getSheet("login").getRow(10).getCell(0).getStringCellValue();
			System.out.println(empty_value);
		}
		catch(NullPointerException n) {
			System.out.println("Check the value present in cell");
		}
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			String mob_no= book.getSheet("login").getRow(2).getCell(1).getStringCellValue();
			System.out.println(mob_no);
		}
		catch(IllegalStateException i) {
			System.out.println("Converting the numeric value into string value");
			FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			String mob_no= NumberToTextConverter.toText(book.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
			System.out.println(mob_no);
		}
	}
}