package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomepage {
	
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openmenu;
	WebDriver driver;
	
	
	public SwagLabHomepage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}
	
	public String logotext() {
		String acttext = logo.getText();
		return acttext;
	}
	
	public void clickonopenmenu() {
		openmenu.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
