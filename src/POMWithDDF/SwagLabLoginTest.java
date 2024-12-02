package POMWithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	
	SwagLogInPage login= new SwagLogInPage(driver);
	login.InpUN(sh.getRow(1).getCell(0).getStringCellValue());
	login.InpPass(sh.getRow(1).getCell(1).getStringCellValue());
	login.clickonLoginBtn();
	
	
	SwagHomepage home= new SwagHomepage(driver);
	home.verifyhomelogo(sh.getRow(3).getCell(0).getStringCellValue());
	Thread.sleep(4000);
	home.openmenu();
	Thread.sleep(4000);
	SwagOpenMenuPage menu= new SwagOpenMenuPage(driver);
	menu.SwgLablogout(); 
	
	
	driver.quit();
	
	
}
}
