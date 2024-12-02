package webdriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	//driver.manage().window().fullscreen();
	
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(3000);
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
}
}
