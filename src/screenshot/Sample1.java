package screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest= new File("C:\\Screeshot\\sample1.png");
	
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
