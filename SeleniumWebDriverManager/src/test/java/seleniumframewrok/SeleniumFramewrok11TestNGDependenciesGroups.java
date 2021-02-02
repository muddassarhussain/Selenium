package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Or if you prefer to define the listeners for multiple classes, then you can use
 * @Listeners({ Package.ClassName.class, Package.ClassName.class })
 * 
*/

public class SeleniumFramewrok11TestNGDependenciesGroups{

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
		
		@Test(dependsOnGroups = "smoke", dependsOnMethods = "Test3", priority = 10)
		public void Test1() { 
			chrome.get("https://www.google.com");
			chrome.findElement(By.name( "q")).sendKeys("Automation");
			try {
			chrome.findElement(By.name("btnK")).submit();
			}
			catch(Exception e) {
			}
		}
		
		@Test(groups = "smoke", priority = 3)
		public void Test2() {
			chrome.get("https://www.google.com");
			chrome.findElement(By.name( "q")).sendKeys("Automation using java");
			try {
			chrome.findElement(By.name("btnK")).submit();
			}
			catch(Exception e) {
			}
		}
		
		@Test(priority = 2)
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