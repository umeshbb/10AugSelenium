package POMWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagHomepage {

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy (xpath = "//button[@id='react-burger-menu-btn']") private WebElement openmenubtn;
	
	
	public SwagHomepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyhomelogo(String explogo) {
		String actlogo = logo.getText();
		if (actlogo.equals(explogo)) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
	}
	
	public void openmenu() {
		openmenubtn.click();
		System.out.println("clicking on the open menu button");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
