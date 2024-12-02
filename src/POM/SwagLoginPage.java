package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLoginPage {

	
	
	@FindBy(xpath = "//input[@name='user-name']")private WebElement Un;
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy(xpath = "//input[@name='login-button']") private WebElement lognbtn;
	
	public SwagLoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	public void InploginPageun (){
		Un.sendKeys("standard_user");
		
	}
	public void InpLoginPass() {
		pwd.sendKeys("secret_sauce");
		
	}
	
	
	public void clickonlogin() {
		lognbtn.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
