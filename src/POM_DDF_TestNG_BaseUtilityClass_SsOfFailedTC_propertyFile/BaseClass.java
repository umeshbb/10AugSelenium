package POM_DDF_TestNG_BaseUtilityClass_SsOfFailedTC_propertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
WebDriver driver;

public void intializeBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
}









}
