package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFramewrok2 {

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
	
		
/*2nd Automation Code Start*/
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.google.com");
	
//		WebElement textbox=chrome.findElement(By.name("q"));
		
		WebElement textbox=chrome.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("facbook");
		textbox.sendKeys(Keys.RETURN);
		
//		chrome.submit();
		
		Thread.sleep(5000); //Throws InteruptedException
		chrome.close();
		java.util.List<WebElement> NoOfWebElements = chrome.findElements(By.xpath("//input"));
		int count= NoOfWebElements.size();
		System.out.println("Count of Web Elements:"+count);
	
		
/*2nd Automation Code End*/

		}
	
/*-----------------------------Chrome Code End Here-----------------------------*/
	
}
