package webdriver_Methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
public static void main(String[] args) throws InterruptedException {
	
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	String title = driver.getTitle();
	System.out.println("Page title is "+title);
	
	String exptitle = "Page title isFacebook – log in or sign up";
	
	if (exptitle.equals(title)) {
		System.out.println("Navigated to the correct page ");
	}
	else {
		System.out.println("Navigated to the wrong page ");
	}
	
	String url = driver.getCurrentUrl(); 
	System.out.println("Current url is "+url);
	
	
}
}
