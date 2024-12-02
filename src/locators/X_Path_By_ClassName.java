package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_By_ClassName {
public static void main(String[] args) {
	
	
	WebDriver dr= new ChromeDriver();
	dr.get("https://www.saucedemo.com/v1/");
	dr.manage().window().maximize();
	
	dr.findElement(By.className("form_input")).sendKeys("standard_user");
	dr.findElement(By.id("password")).sendKeys("secret_sauce");
	dr.findElement(By.className("btn_action")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
