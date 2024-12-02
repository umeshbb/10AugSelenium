package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_PathBy_LinkedText {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/?_rdr");
		driver.findElement(By.linkText("Forgotten password?")).click();
	//	driver.findElement(By.l)
		
		
	}

}
