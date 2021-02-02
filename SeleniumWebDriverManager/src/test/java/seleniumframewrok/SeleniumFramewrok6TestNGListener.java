package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Or if you prefer to define the listeners for multiple classes, then you can use
 * @Listeners({ Package.ClassName.class, Package.ClassName.class })
 * 
*/

@Listeners(seleniumframewrok.SeleniumFramewrok6TestNGListenerMethods.class)
public class SeleniumFramewrok6TestNGListener{

	public static WebDriver chrome=null;
	public static ExtentReports extentreports=null;
	public static ExtentTest test=null;
	
	
/*-----------------------------------Main Method-----------------------------------*/
	
	//While running our test in TestNG framework, we do not need Main Method. so we comment it.
	
//	public static void main(String[] args){
		
/*-----------------------------Chrome Code Start Here-----------------------------*/
	
	/*5th Automation Extent-HTML/Spark-Report+TestNG Code Start Here*/
	
	
		@BeforeSuite
		public void onceruncode() {
		//  start reporters
			ExtentSparkReporter extentsparkreporterOBJ=new ExtentSparkReporter("ExtentSparkReporter.html");

		//  create ExtentReports and attach reporter(s)
			extentreports=new ExtentReports();
			extentreports.attachReporter(extentsparkreporterOBJ);
			
		//  creates a toggle for the given test, adds all log events under it 
			test = extentreports.createTest("TestNG+ExtentReports", "Sample description");
			
			test.log(Status.INFO, "Starting a test");
		}
	
		@BeforeTest
		public void creatingobj() {
		    WebDriverManager.chromedriver().setup();
			chrome=new ChromeDriver();
			
		}
		
		@Test
		public void Test1() {
			chrome.get("https://www.google.com");
		//  test.info("Starting a test-2");
	        test.pass("Navigated to Chrome");
	        
			chrome.findElement(By.name("q")).sendKeys("Automation");
			test.pass("Entered text in search box");
			
			try {
			chrome.findElement(By.name("btnK")).submit();
			test.pass("clicked on the search button");
			}
			catch(Exception e) {
			test.fail("Search button not found");
			}
		}
		
		@Test
		public void Test2() {
			chrome.get("https://www.google.com");
	        test.pass("Navigated to Chrome");
	        
			chrome.findElement(By.name("q")).sendKeys("Automation");
			test.pass("Entered text in search box");
			
			try {
			chrome.findElement(By.name("btnK")).submit();
			test.pass("clicked on the search button");
			}
			catch(Exception e) {
			test.fail("Search button not found");
			}
		}
		
		@Test
		public void Test3() {
			chrome.get("https://www.google.com");
	        test.pass("Navigated to Chrome");
	        
			chrome.findElement(By.name("q")).sendKeys("Automation");
			test.pass("Entered text in search box");
			
			try {
			chrome.findElement(By.name("btnK")).submit();
			test.pass("clicked on the search button");
			}
			catch(Exception e) {
			test.fail("Search button not found");
			}
		}
		
		@AfterTest
		public void endftest() throws InterruptedException {
			Thread.sleep(5000);
			chrome.close();
			test.pass("Closed the browser");
			
			test.info("Test completed successfully");
		}
		
		@AfterSuite
		public void onceruncodeafter(){
		//  calling flush writes everything to the log file
			extentreports.flush();
		}
		
	/*5th Automation Extent-HTML/Spark-Report+TestNG Code Ends Here*/
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
//}

}