package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFramewrok4ExtentReports {

	public static WebDriver chrome=null;
	
/*-----------------------------------Main Method-----------------------------------*/
	
	public static void main(String[] args){
		
/*-----------------------------Chrome Code Start Here-----------------------------*/
		
/*4th Automation Extent-HTML/Spark-Report Code Start Here*/
		// start reporters
		ExtentSparkReporter extentsparkreporterOBJ=new ExtentSparkReporter("ExtentSparkReporter.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extentreports=new ExtentReports();
		extentreports.attachReporter(extentsparkreporterOBJ);
		
		// creates a toggle for the given test, adds all log events under it 
        ExtentTest test = extentreports.createTest("MyFirstTest", "Sample description");
        
        test.log(Status.INFO, "Starting a test");
//      test.info("Starting a test-2");
        WebDriverManager.chromedriver().setup();
		chrome=new ChromeDriver();
        chrome.get("https://www.google.com");
        test.pass("Navigated to Chrome");
        
		chrome.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered text in search box");
		
		try {
		chrome.findElement(By.name("btnk")).submit();
		test.pass("clicked on the search button");
		}
		catch(Exception e) {
		test.fail("Search button not found");
		}
		
		chrome.close();
		test.pass("Closed the browser");
		
		test.info("Test completed successfully");
		
		// calling flush writes everything to the log file
		extentreports.flush();
		
/*4th Automation Extent-HTML/Spark-Report Code Ends Here*/
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
}

}