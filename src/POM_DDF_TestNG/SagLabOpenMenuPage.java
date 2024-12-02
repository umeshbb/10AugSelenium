package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SagLabOpenMenuPage {

	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	WebDriver driver;
	
	
	public SagLabOpenMenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogout() {
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
