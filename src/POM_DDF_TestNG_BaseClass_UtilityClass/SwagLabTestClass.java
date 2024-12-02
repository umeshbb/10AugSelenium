package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabTestClass extends BaseClass {
	
	SwagLabLoginPage login;
	SwagLabHomepage home;
	SwagLabOpenMenuPage menu;
	
	
	@BeforeClass
	public void openbrowser() {
		initalizeBrowser();
		login= new SwagLabLoginPage(driver);
		home= new SwagLabHomepage(driver);
		menu= new SwagLabOpenMenuPage(driver);
		
	}
	@BeforeMethod
	public void logintoApp() throws EncryptedDocumentException, IOException {
		login.InpUN(UtilityClass.GetTD(1, 0));
		login.InpPWD(UtilityClass.GetTD(1, 1));
		login.cliclonloginbtn();
		
	}
  @Test
  public void verifylogotext() throws EncryptedDocumentException, IOException {
	 String lotext = home.logotext();
	String explogotext = UtilityClass.GetTD(3, 0);
	Assert.assertEquals(lotext, explogotext,"Failed:-- Both Results are diffrent");
	
  }
  
  @AfterMethod
  public void logout() throws InterruptedException {
	  home.clickonopenmenu();
	  Thread.sleep(5000);
	  menu.logout();
	  
  }
@AfterClass
public void quitbrowser() {
	driver.quit();
}
}
