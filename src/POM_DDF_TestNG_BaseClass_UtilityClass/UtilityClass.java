package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {

	// This methos is used to get test data from excel sheet
	//Need to pass to inputs --Row index & Cell index
	// @author-- Umesh Birajdar
	
	public static String GetTD(int rowindex, int cellindex) throws EncryptedDocumentException, IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return value;
	}
	
	public static void capturess(WebDriver driver ,int TCID) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Umesh\\eclipse-workspace\\10AugSelenium\\Screenshot\\TestCaseID"+TCID+".jpg");

        org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
	
	
	
	
	
	
	
	
	
	
}
