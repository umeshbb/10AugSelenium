package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_ByContainsText {
public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Create new ')]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
