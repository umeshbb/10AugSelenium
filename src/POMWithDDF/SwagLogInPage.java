package POMWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLogInPage {

	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginbtn;
	
	
	@FindBy(xpath = "//button[@class='error-button']") private WebElement ErrorMsg;
	
	public SwagLogInPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void InpUN(String Username) {
		UN.sendKeys(Username);
		System.out.println("sending user name for login");
	}
	
	public void InpPass(String password) {
		PWD.sendKeys(password);
		System.out.println("sending password for login");
	}
	
	public void clickonLoginBtn() {
		loginbtn.click();
		System.out.println("clcking ob login button");
	}
	
	public void verifyerrorMsg(String expErrorMsg) {
		
	String actErrormsg = ErrorMsg.getText();
	if(actErrormsg.equals(expErrorMsg)) {
		System.out.println("Error msg Text is pass");
		
	}
	else {
		System.out.println("Error msg Text is  Fail");
	}
	
	}
	
	
	
	
	
	
}
