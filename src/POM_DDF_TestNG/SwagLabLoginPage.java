package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
      @FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
      @FindBy (xpath = "//input[@id='password']") private WebElement PWD;
      
      @FindBy(xpath = "//input[@id='login-button']") private WebElement loginbtn;
	
      WebDriver driver;
      
      
      public SwagLabLoginPage(WebDriver driver) {
    	  PageFactory.initElements(driver,this);
    	  
      }
	

	public void InpUN(String Username) {
		UN.sendKeys(Username);
	}
	
	public void InpPwd(String Pwd) {
		PWD.sendKeys(Pwd);
	}
	
	public void clickonLoginBtn() {
		loginbtn.click();	}

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

