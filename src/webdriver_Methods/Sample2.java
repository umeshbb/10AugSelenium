package webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 driver.quit();
	 
	
	
	
	
	
}
}
