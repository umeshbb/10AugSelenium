package POM_DDF_TestNG;

import static org.testng.Assert.assertThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest {

	SwagLabLoginPage login;
	SwagLabHomepage home;
	SagLabOpenMenuPage menu;
	Sheet sh;
	WebDriver driver;
	 @BeforeClass 
	  public void  OpenBrowser1() throws EncryptedDocumentException, IOException  {
			
			FileInputStream file= new FileInputStream("C:\\Users\\Umesh\\Downloads\\Umesh Excel.xlsx");
			sh=WorkbookFactory.create(file).getSheet("Sheet1");
			
			driver= new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		login= new SwagLabLoginPage(driver);
		home= new SwagLabHomepage(driver);
		menu= new SagLabOpenMenuPage(driver);
		
			}
	 @BeforeMethod
	 public void LoginToApp() {
		 
		 login.InpUN(sh.getRow(1).getCell(0).getStringCellValue());
		 login.InpPwd(sh.getRow(1).getCell(1).getStringCellValue());
		 login.clickonLoginBtn();
	 }
	 
	 @Test
public void verifylogo() {
		String actlogo = home.getSwagLabHomePagelogo();
		String explogo = sh.getRow(3).getCell(0).getStringCellValue();
		Assert.assertEquals(actlogo, explogo,"failed:-both results are diffrent");
		
	 }
	
	@AfterMethod
	public void logoutfromapp() throws InterruptedException{
		home.clickonmenu();
		Thread.sleep(3000);
		menu.clickonlogout();
	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
	
	
	
}
