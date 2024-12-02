package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_By_Partial_Linked_Text {
public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://sauce-demo.myshopify.com");
	driver.findElement(By.partialLinkText("Log")).click();
	
	
	
	
	
	
	
	
	
	
	
}
}
