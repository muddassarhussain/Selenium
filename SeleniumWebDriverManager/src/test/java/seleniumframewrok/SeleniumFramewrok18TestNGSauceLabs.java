package seleniumframewrok;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.*;

/*
 * "Ignore" will ignore all the test inside a class
 */

// @Ignore
public class SeleniumFramewrok18TestNGSauceLabs{
	
//	public static WebDriver driver=null;
	public static String SAUCE_USERNAME="muddassarhussain";
	public static String SAUCE_ACCESS_KEY="e137dd3d-77d6-40a1-8285-c3815a755e46";
	public static final String URL = "https://" + SAUCE_USERNAME + ":" + SAUCE_ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
			
	/*-----------------------------------Main Method-----------------------------------*/

	//While running our test in TestNG framework, we do not need Main Method. so we comment it.

	/*-----------------------------Chrome Code Start Here-----------------------------*/
	public static void main(String[] args) throws IOException{
		
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browserName", "firefox");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "SauceLabs First Test");
		caps.setCapability("extendedDebugging", "true");
		
//		caps.setCapability("platform", "Windows XP");
//	    caps.setCapability("version", "43.0");
//	    caps.setCapability("name", "SauceLabsTest");
	    
//		WebDriverManager.chromedriver().setup();
//		WebDriver driv=new ChromeDriver();
//		
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

//	    Write your test here
	    
	    driver.get("https://google.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.name( "q")).sendKeys("SauceLabs Selenium Scripts");
	    driver.findElement(By.name("btnK")).submit(); 
	    driver.quit();	 	

    /*5th Automation TestNG+SauceLabs Code Ends Here*/
	}
/*-----------------------------Chrome Code End Here-----------------------------*/
}