package seleniumframewrok;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.*;

/*
 * "Ignore" will ignore all the test inside a class
 */

// @Ignore
public class SeleniumFramewrok19TestNGBrowserStack{
	
	public static WebDriver driver=null;
	public static final String USERNAME = "muddassarhussain2";
	public static final String AUTOMATE_KEY = "p6nrtBKDHYhaWxAxonuW";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
			
	/*-----------------------------------Main Method-----------------------------------*/

	//While running our test in TestNG framework, we do not need Main Method. so we comment it.

	/*-----------------------------Chrome Code Start Here-----------------------------*/
//	public static void main(String[] args) throws IOException{
		@BeforeTest
		public void start() throws IOException {
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "muddassarhussain2's First Test");
		
//		caps.setCapability("platform", "Windows XP");
//	    caps.setCapability("version", "43.0");
//	    caps.setCapability("name", "SauceLabsTest");
	    
//		WebDriverManager.chromedriver().setup();
//		WebDriver driv=new ChromeDriver();
//		
		driver = new RemoteWebDriver(new URL(URL), caps);
	}
		@Test
		public void test() {
//	    Write your test here
	    
	    driver.get("https://google.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.name( "q")).sendKeys("SauceLabs Selenium Scripts");
	    driver.findElement(By.name("btnK")).submit(); 
	    
		}
		@AfterTest
		public void end() {
	    driver.quit();	 	

    /*5th Automation TestNG+SauceLabs Code Ends Here*/
	}
/*-----------------------------Chrome Code End Here-----------------------------*/
}