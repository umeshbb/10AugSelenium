package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Click_ClearMethhod {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("9865214587");
	driver.findElement(By.id("pass")).sendKeys("985455161321");
	
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).clear();
	
	driver.findElement(By.name("login")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
