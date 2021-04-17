package seleniumframewrok;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * "Ignore" will ignore all the test inside a class
*/

// @Ignore
public class SeleniumFramewrok14TestNGWait{

	public static WebDriver chrome=null;
	
	
/*-----------------------------------Main Method-----------------------------------*/
	
	//While running our test in TestNG framework, we do not need Main Method. so we comment it.
	
//	public static void main(String[] args){
		
/*-----------------------------Chrome Code Start Here-----------------------------*/
	
	/*5th Automation TestNG+Wait Code Start Here*/

	
		@BeforeTest
		public void creatingobj() {
		    WebDriverManager.chromedriver().setup();
			chrome=new ChromeDriver();
			
		}
		@Test
		public void Test1() { 
			chrome.get("https://www.google.com");
			chrome.findElement(By.name( "q")).sendKeys("Automation");
			chrome.findElement(By.name("btnK")).submit();
			
//			//Implicit wait (stadard frequency of implicit wait is 250 miliseconds)
//			chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			chrome.findElement(By.name("abcd")).submit();
			
			//Explicit wait 
			WebDriverWait wait=new WebDriverWait(chrome,20);
			WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
			chrome.findElement(By.name("abcd")).submit();
		}
		
		@AfterTest
		public void endftest() throws InterruptedException {
			Thread.sleep(5000);
			chrome.close();
		}
		
		/*5th Automation TestNG+Wait Code Start Here*/
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
//}

}