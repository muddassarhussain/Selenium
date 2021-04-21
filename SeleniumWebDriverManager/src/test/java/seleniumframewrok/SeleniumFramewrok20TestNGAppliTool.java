package seleniumframewrok;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.Eyes.*;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * "Ignore" will ignore all the test inside a class
 */

// @Ignore
public class SeleniumFramewrok20TestNGAppliTool{
	
	private EyesRunner runner=null;
	private Eyes eyes=null;
	private static BatchInfo batch=null;
	private WebDriver driver=null;

	@BeforeClass
	public static void setBatch() {
		// Must be before ALL tests (at Class-level)
		batch = new BatchInfo("AppliTool Test");
	}

	@Before
	public void beforeEach() {
		
		// Use Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		// Initialize the Runner for your test.
		runner = new ClassicRunner();

		// Initialize the eyes SDK
		eyes = new Eyes(runner);

		// Raise an error if no API Key has been found.
//		if(IsNull<(System.getenv("UvMlWMPWYdGPryz8xDTykPZy106CGACmJAY280tP105106Bh8110"))> ) {
//		    throw new RuntimeException("No API Key found; Please set environment variable 'APPLITOOLS_API_KEY'.");
//		}

		// Set your personal Applitols API Key from your environment variables.
		eyes.setApiKey("UvMlWMPWYdGPryz8xDTykPZy106CGACmJAY280tP105106Bh8110");

		// set batch name
		eyes.setBatch(batch);

	}

	@Test
	public void basicTest() {
		// Set AUT's name, test name and viewport size (width X height)
		// We have set it to 800 x 600 to accommodate various screens. Feel free to
		// change it.
		try {
		eyes.open(driver, "AppliTool First App", "Smoke Test", new RectangleSize(1600, 800));

		// Navigate the browser to the "ACME" demo app.
		driver.get("https://demo.applitools.com");

		// To see visual bugs after the first run, use the commented line below instead.
		//driver.get("https://demo.applitools.com/index_v2.html");

		// Visual checkpoint #1 - Check the login page.
		eyes.checkWindow("Login Window");

		// This will create a test with two test steps.
		driver.findElement(By.id("log-in")).click();

		// Visual checkpoint #2 - Check the app page.
		eyes.checkWindow("App Window");
			
		} finally {
			// TODO: handle finally clause
		// End the test.
		eyes.closeAsync();
		}
		// Close the browser.
		driver.quit();

		// If the test was aborted before eyes.close was called, ends the test as
		// aborted.
		eyes.abortIfNotClosed();

		// Wait and collect all test results
		TestResultsSummary allTestResults = runner.getAllTestResults();

		// Print results
		System.out.println(allTestResults);
	}

    /*5th Automation TestNG+SauceLabs Code Ends Here*/
	}
/*-----------------------------Chrome Code End Here-----------------------------*/