package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_ContainsAttribute {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1')]")).sendKeys("9860282151");
	
	driver.findElement(By.xpath("//input[contains(@type,\"password\")]")).sendKeys("9421482711");	
	
	
	
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
