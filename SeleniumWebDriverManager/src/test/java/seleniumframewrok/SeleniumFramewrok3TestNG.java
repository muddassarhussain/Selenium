package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFramewrok3TestNG {

	public static WebDriver chrome=null;
	public static WebDriver firefox=null;
	
/*-----------------------------------Main Method-----------------------------------*/
	
//	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*-----------------------------Firefox Code Start Here-----------------------------*/
		
	/*	
		WebDriverManager.firefoxdriver().setup();
		WebDriver firefox=new FirefoxDriver();
		firefox.get("https://www.yahoo.com");
		String yahoo= firefox.getTitle();
		System.out.println("Yahoo page title:"+ yahoo);
		Thread.sleep(10000); //Throws InteruptedException
		firefox.close();
	*/	
		
/*-----------------------------Firefox Code End Here-----------------------------*/
		
		
/*-----------------------------Chrome Code Start Here-----------------------------*/
		

/*3rd Automation TestNG Code Start Here*/
	
		//Creating Seperate methods for refining of code.
		//Also to Use TestNG Framework
	
		@BeforeTest
		public void BeforeTest() {
			WebDriverManager.chromedriver().setup();
			chrome=new ChromeDriver();
		}
		
		/*
		 *1- Installation guide of TestNG Plugin.
		 * https://dl.bintray.com/testng-team/testng-eclipse-release/
		 * 2-Add MVN TestNG libraries.
		 */		
		
		public static String PageTitle;
		@Testtilemountain
		public void OriginalTest() {
			chrome.get("https://www.google.com");
		//	WebElement element = null;
			chrome.findElement(By.name("q")).sendKeys("Automation");
			chrome.findElement(By.name("btnK")).submit();
			PageTitle = chrome.getTitle();
		}
		
		@Testtilemountain
		public void OriginalTest2() {
			chrome.get("https://www.google.com");
		//	WebElement element = null;
			chrome.findElement(By.name("q")).sendKeys("Automation");
			chrome.findElement(By.name("btnK")).submit();
			PageTitle = chrome.getTitle();
		}
	
		@AfterTest
		public void AfterTest() throws InterruptedException {
			Thread.sleep(5000); //Throws InteruptedException
			chrome.close();
			System.out.println("Page Title Is:"+PageTitle);
		}
		
/*3rd Automation TestNG Code End Here*/
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
}
