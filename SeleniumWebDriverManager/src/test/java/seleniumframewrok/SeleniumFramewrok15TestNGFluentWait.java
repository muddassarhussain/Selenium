package seleniumframewrok;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * "Ignore" will ignore all the test inside a class
 */

// @Ignore
public class SeleniumFramewrok15TestNGFluentWait{

	public static WebDriver driver=null;


	/*-----------------------------------Main Method-----------------------------------*/

	//While running our test in TestNG framework, we do not need Main Method. so we comment it.

	//	public static void main(String[] args){

	/*-----------------------------Chrome Code Start Here-----------------------------*/

	/*5th Automation TestNG+FluentWait Code Start Here*/

	@BeforeTest
	public void creatingobj() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
	}
	@Test
	public void Test1() { 
		driver.get("https://www.google.com");
		driver.findElement(By.name( "q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).submit();

		//	  //Implicit wait (stadard frequency of implicit wait is 250 miliseconds)
		//			chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//			chrome.findElement(By.name("abcd")).submit();
		//			
		//	  //Explicit wait 
		//			WebDriverWait wait=new WebDriverWait(chrome, 20);
		//			WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));

		//Fluent Wait
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element= driver.findElement(By.linkText("Automation.com"));
				if(element.isEnabled()) {
					System.out.println("Element found");
				}
				return element;
			}
			
		});
		foo.click();

	}
	@AfterTest
	public void endftest() throws InterruptedException {
		//Thread.sleep(5000);
		driver.close();
	}

	/*5th Automation TestNG+FluentWait Code Start Here*/

	/*-----------------------------Chrome Code End Here-----------------------------*/

	//}

}