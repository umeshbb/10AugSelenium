package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByText {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
