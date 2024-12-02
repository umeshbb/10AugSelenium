package webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	Thread.sleep(5000);
	
	driver.close();  // close method will close current tab
	
	
}
}
