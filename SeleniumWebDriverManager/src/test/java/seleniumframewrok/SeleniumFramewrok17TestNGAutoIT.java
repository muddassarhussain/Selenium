package seleniumframewrok;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * "Ignore" will ignore all the test inside a class
 */

// @Ignore
public class SeleniumFramewrok17TestNGAutoIT{

	public static WebDriver chrome=null;


	/*-----------------------------------Main Method-----------------------------------*/

	//While running our test in TestNG framework, we do not need Main Method. so we comment it.

	//	public static void main(String[] args){

	/*-----------------------------Chrome Code Start Here-----------------------------*/

	/*5th Automation TestNG+AutiIT Code Start Here*/

	@BeforeTest
	public void creatingobj() {
				WebDriverManager.chromedriver().setup();
				chrome=new ChromeDriver();	
	}
	@Test
	public void Test1() throws IOException { 
				chrome.get("https://tinypng.com/");
				chrome.findElement(By.className("target")).click();
				chrome.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				Runtime.getRuntime().exec("C:\\Users\\rocok\\git\\repository\\SeleniumWebDriverManager\\FileUploadScript(AutoIT).exe");
				chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 		
//		        driver.quit();	 	
	}
	@AfterTest
	public void endftest() throws InterruptedException {
		//		Thread.sleep(5000);
		//		driver.close();
	}

	/*5th Automation TestNG+AutiIT Code Start Here*/

	/*-----------------------------Chrome Code End Here-----------------------------*/

	//}

}