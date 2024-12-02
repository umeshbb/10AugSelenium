package POMWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagOpenMenuPage {

	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	
	
	public SwagOpenMenuPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SwgLablogout() {
		logout.click();
		System.out.println("logging out from application");
	}
	
	
	
}
