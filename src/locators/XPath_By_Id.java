package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_By_Id {
public static void main(String[] args) {
	WebDriver dr= new ChromeDriver();
	dr.get("https://www.facebook.com/?_rdr");
	dr.findElement(By.id("email")).sendKeys("9860282151");  // xpath by id
	dr.findElement(By.id("pass")).sendKeys("9421482711");   // xpathn by id
	dr.findElement(By.name("login")).click();// xPath by mame
	
}
}
