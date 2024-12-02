package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomepage {

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openmenu;
	WebDriver driver;
	
	
	
	public SwagLabHomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	public void verifylogo(String explogo) {
//		String actlogo = logo.getText();
//		if(actlogo.equals(explogo)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("Fail");
//			
//		}
//	}
	
	public String getSwagLabHomePagelogo() {
		String logotext = logo.getText();
		return logotext;
		
	}
	public void clickonmenu() {
		openmenu.click();
	}
	
	
	
	
	
	
	
}
