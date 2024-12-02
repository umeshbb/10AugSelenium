package excel_data_Reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
	
	String Fname = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	
	System.out.println("first name is "+Fname);
	
	
	
	FileInputStream file1= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
	
	String lname = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	
	System.out.println("Last name is "+lname);
	
	FileInputStream file2= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
	int rownum = WorkbookFactory.create(file2).getSheet("Sheet1").getLastRowNum()+1;
	System.out.println(rownum);

	
}
}
