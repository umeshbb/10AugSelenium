package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
WebDriver driver;



 public void initalizeBrowser() {
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
 }


















}
