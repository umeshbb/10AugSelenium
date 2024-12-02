package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	boolean select = driver.findElement(By.xpath("//label[text()=\"Female\"]")).isSelected();
	System.out.println("sex selection status is "+select);
	
	driver.quit();
	
	
	
	
	
	
}

}
