package seleniumframewrok;

import static com.google.common.base.Strings.isNullOrEmpty;
import com.applitools.eyes.*;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.selenium.Eyes;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Runs Applitools test for the demo app https://demo.applitools.com
 */
public class SeleniumFramewrok20TestNGAppliToolOffice {

	private EyesRunner runner;
	private Eyes eyes;
	private static BatchInfo batch;
	private WebDriver driver;

	@BeforeTest
	public void beforeEach() {
		// Must be before ALL tests (at Class-level)
				batch = new BatchInfo("Demo batch");
				
		// Initialize the Runner for your test.
		runner = new ClassicRunner();

		// Initialize the eyes SDK
		eyes = new Eyes(runner);

		// Raise an error if no API Key has been found.
		if(isNullOrEmpty(System.getenv("UvMlWMPWYdGPryz8xDTykPZy106CGACmJAY280tP105106Bh8110"))) {
		    throw new RuntimeException("No API Key found; Please set environment variable 'APPLITOOLS_API_KEY'.");
		}

		// Set your personal Applitols API Key from your environment variables.
		eyes.setApiKey(System.getenv("UvMlWMPWYdGPryz8xDTykPZy106CGACmJAY280tP105106Bh8110"));

		// set batch name
		eyes.setBatch(batch);

		// Use Chrome browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void basicTest() {
		// Set AUT's name, test name and viewport size (width X height)
		// We have set it to 800 x 600 to accommodate various screens. Feel free to
		// change it.
		eyes.open(driver, "Demo App", "Smoke Test", new RectangleSize(800, 800));

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

		// End the test.
		eyes.closeAsync();
	}

	@AfterTest
	public void afterEach() {
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
}
