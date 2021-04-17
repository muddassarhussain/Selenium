package seleniumframewrok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFramewrok1 {

	public static WebDriver chrome=null;
	public static WebDriver firefox=null;
	
/*-----------------------------------Main Method-----------------------------------*/
	
	public static void main(String[] args) throws InterruptedException {
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
		
		
/*First Simple Automation Code Start*/
	
		WebDriverManager.chromedriver().setup();
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.google.com");
		Thread.sleep(5000); //Throws InteruptedException
		chrome.close();
		
/*First Simple Automation Code End*/
		
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
}
}
