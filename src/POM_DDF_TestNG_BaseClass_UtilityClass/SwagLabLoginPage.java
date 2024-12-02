package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement Loginbtn;
	@FindBy(xpath = "//button[@class='error-button']") private WebElement errorbtn;
	
	WebDriver driver;
	
	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void InpUN(String Username) {
		UN.sendKeys(Username);
	}
	
	public void InpPWD(String Pwd) {
		PWD.sendKeys(Pwd);
	}
	public void cliclonloginbtn() {
		Loginbtn.click();
	}
	public String errormessgtext() {
		String text = errorbtn.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
