package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String text = driver.findElement(By.className("_8eso")).getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
}
}
