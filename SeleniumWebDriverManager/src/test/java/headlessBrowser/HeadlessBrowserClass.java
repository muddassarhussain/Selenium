package headlessBrowser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessBrowserClass {

	public static void main(String[] args) {
		
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		//WebDriverManager.phantomjs().setup();
		//PhantomJSDriver driver=new PhantomJSDriver();
		
		//HtmlUnitDriver-Headless Browser
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_3);

		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.webdriver/webdriver-htmlunit/0.9.7376");
		System.out.println("Title is:"+driver.getTitle());
		driver.close();
	}

}
