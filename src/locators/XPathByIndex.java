package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByIndex {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver dr= new ChromeDriver();
	dr.get("https://www.facebook.com/");
	
	dr.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();


	dr.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("UMESH");
	dr.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("BIRAJDAR");
	dr.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("9860282151");
	dr.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("9860282151");
			dr.findElement(By.xpath("//input[@type=\"radio\"]")).click();
			dr.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
//			dr.findElement(By.xpath("(//input[@type=\"radio\"])[2])")).click();
//			dr.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
			
			dr.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
			
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
