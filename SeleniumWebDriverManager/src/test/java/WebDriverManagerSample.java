import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerSample {

	static String browser;
	public static void main(String[] args) {
		SetWebdriverManager();
		ObjectCreationAndCall();
	}
	//Sample Code Modular 
	public static void SetWebdriverManager() {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		browser="firefox";
		
	}
	public static void ObjectCreationAndCall() {
		if(browser.contains("chrome"))
		{
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.selenium.dev/downloads/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chrome.close();
		}
		if(browser.contains("firefox"))
		{
		WebDriver firefox=new FirefoxDriver();
		firefox.get("https://www.selenium.dev/downloads/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		firefox.close();
		}
	}
}
