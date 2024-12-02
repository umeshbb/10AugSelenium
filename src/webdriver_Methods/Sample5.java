package webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(3000);
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	driver.close();// close the current tab
	driver.quit();      // close all tabs
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
