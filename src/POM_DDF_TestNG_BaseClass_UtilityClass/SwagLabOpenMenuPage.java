package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabOpenMenuPage {

	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	WebDriver driver;
	
	
	public SwagLabOpenMenuPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void logout() {
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
