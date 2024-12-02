package POM_DDF_TestNG_BaseUtilityClass_SsOfFailedTC_propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
// This method is used to getTestData from the Excel
	//Need to pass 2 inputs 1Row index and 2.Cell Index
	//@author ==Umesh Birajdar
	
	public static String getTD(int rowindex,int cellindex) throws EncryptedDocumentException, IOException   {
		FileInputStream file= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		return value;
		
	}
	
	
	public static void CaptureSS(WebDriver driver,String TCID) throws IOException {
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Umesh\\eclipse-workspace\\10AugSelenium\\Screenshot\\TestCaseID "+TCID+".jpg");
		FileHandler.copy(ss, dest);
	}
	
	public static String getPFData() {
		return null;
		
	};
	
}
