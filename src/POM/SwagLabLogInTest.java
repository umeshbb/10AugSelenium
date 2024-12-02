package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLogInTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	SwagLoginPage login= new SwagLoginPage(driver);
	login.InploginPageun();
	login.InpLoginPass();
	login.clickonlogin();
	
	Thread.sleep(2000);
	 SwagLabHomepage home= new SwagLabHomepage(driver);
	 home.verifyhomepagelogo();
	 Thread.sleep(2000);
	 home.clickonopenmenu();
	 Thread.sleep(2000);
	 
	 SWagLabOpenMenuPage menu= new SWagLabOpenMenuPage(driver);
	 menu.logout();
	 
	 driver.quit();
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
