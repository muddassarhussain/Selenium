package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.*;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * "Ignore" will ignore all the test inside a class
 */

// @Ignore
public class SeleniumFramewrok16TestNGChromeOptionsHeadleassBrowser{

	public static WebDriver driver=null;


	/*-----------------------------------Main Method-----------------------------------*/

	//While running our test in TestNG framework, we do not need Main Method. so we comment it.

	//	public static void main(String[] args){

	/*-----------------------------Chrome Code Start Here-----------------------------*/

	/*5th Automation TestNG+ChromeOptionsHeadleassBrowser Code Start Here*/

	@BeforeTest
	public void creatingobj() {
				WebDriverManager.chromedriver().setup();
				
		//chromeoptions is a class provided by Chrome management to use chrome as a Headless Browser
		
				ChromeOptions cohb=new ChromeOptions();
				cohb.addArguments("--headless");
				cohb.addArguments("window-size=1920,1080");
				driver=new ChromeDriver(cohb);	
	}
	@Test
	public void Test1() { 
				driver.get("https://www.google.com");
				System.out.println("Tilte is "+driver.getTitle());
				driver.findElement(By.name( "q")).sendKeys("Automation");
				driver.findElement(By.name("btnK")).submit();
		
		//HtmlUnitDriver-Headless Browser
//			Example-1
//				HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_3);
//				driver.get("https://mvnrepository.com/artifact/org.seleniumhq.webdriver/webdriver-htmlunit/0.9.7376");
//				System.out.println("Title is:"+driver.getTitle());
//				driver.close();
//
		//HtmlUnitDriver-Headless Browser
//			Example-2
//				 WebDriver driver = new HtmlUnitDriver();
//				 driver.get("http://www.google.com");
//				 WebElement element = driver.findElement(By.name("q"));
//		 		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				 element.sendKeys("Guru99");
//				 element.submit();
//				 System.out.println("Page title is: " + driver.getTitle());		
//		         driver.quit();
//		 	
	}
	@AfterTest
	public void endftest() throws InterruptedException {
//		Thread.sleep(5000);
		driver.close();
	}

	/*5th Automation TestNG+HeadlessBrowserChrome Ends Start Here*/

	/*-----------------------------Chrome Code End Here-----------------------------*/

	//}

}