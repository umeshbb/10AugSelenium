package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1_XpathByAttribute 
{
public static void main(String[] args) {
	
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9860282151");
	
	
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9421482711");
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
