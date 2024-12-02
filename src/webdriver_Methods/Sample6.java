package webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	
	driver.manage().window().maximize();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/");
	
	
	
	
	
	
	
}
}
