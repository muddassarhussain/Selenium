package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * "Ignore" will ignore all the test inside a class
*/

// @Ignore
public class SeleniumFramewrok12TestNGIgnore{

	public static WebDriver chrome=null;
	public static ExtentReports extentreports=null;
	public static ExtentTest test=null;
	
	
/*-----------------------------------Main Method-----------------------------------*/
	
	//While running our test in TestNG framework, we do not need Main Method. so we comment it.
	
//	public static void main(String[] args){
		
/*-----------------------------Chrome Code Start Here-----------------------------*/
	
	/*5th Automation TestNG+Dependencies+Groups Code Start Here*/

	
		@BeforeTest
		public void creatingobj() {
		    WebDriverManager.chromedriver().setup();
			chrome=new ChromeDriver();
			
		}
		@Ignore //this Ignore will ignore this test and run all other test cases
		@Testtilemountain(priority = 1)
		public void Test1() { 
			chrome.get("https://www.google.com");
			chrome.findElement(By.name( "q")).sendKeys("Automation");
			try {
			chrome.findElement(By.name("btnK")).submit();
			}
			catch(Exception e) {
			}
		}
		
		@Testtilemountain(priority = 2)
		public void Test2() { 
			chrome.get("https://www.google.com");
			chrome.findElement(By.name( "q")).sendKeys("Automation using java");
			try {
			chrome.findElement(By.name("btnK")).submit();
			}
			catch(Exception e) {
			}
		}
		
		@Testtilemountain(priority = 0)
		public void Test3() {
			chrome.get("https://www.google.com");
			chrome.findElement(By.name( "q")).sendKeys("Automation using JS");
			try {
			chrome.findElement(By.name("btnK")).submit();
			}
			catch(Exception e) {
			}
		}
		
		@AfterTest
		public void endftest() throws InterruptedException {
			Thread.sleep(5000);
			chrome.close();
		}
		
		/*5th Automation TestNG+Dependencies+Groups Code Start Here*/
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
//}

}