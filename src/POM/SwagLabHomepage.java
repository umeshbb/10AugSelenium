package POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomepage {

	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	
	public SwagLabHomepage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void verifyhomepagelogo() {
		String actlogo = logo.getText();
		String explogo="Swag Labs";
		if(actlogo.equals(explogo)) {
			System.out.println("pass");
		}
			else {
				System.out.println("Fail");
			}
	
	}
		public void clickonopenmenu() 
		{
			openMenu.click();
		}
}
	
	
	
	
	

