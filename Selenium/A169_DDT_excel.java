package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A169_DDT_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Process 1
		FileInputStream fis= new FileInputStream("C:\\Users\\Surya-LAPTOP\\eclipse-workspace\\NewJavaPro\\DDTExcel\\personalinfo.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh= book.getSheet("login");
		Row row= sh.getRow(0);
		Cell cell= row.getCell(0);
		Cell cell1= row.getCell(1);
		String value= cell.getStringCellValue();
		String value1= cell1.getStringCellValue();
		System.out.println(value);
		System.out.println(value1);
		
		//Process 2
		String val= book.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String val1= book.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(val);
		System.out.println(val1);
	}
}