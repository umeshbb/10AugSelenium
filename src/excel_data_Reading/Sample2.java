package excel_data_Reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	FileInputStream file = new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
	
	 double num = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	
	System.out.println(num);
	
	

	
	
}
}
