package automationinteview;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationInterviewLoginScript {

	public static void main(String[] args) throws Exception {
				WebDriverManager.chromedriver().setup();
				WebDriver chrome=new ChromeDriver();
				chrome.get("https://test.forkfreight.com/#/login");
				chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				chrome.findElement(By.name("email")).click();
				chrome.findElement(By.name("email")).clear();
				chrome.findElement(By.name("email")).sendKeys("test_task@mailinator.com");
				chrome.findElement(By.name("password")).click();
				chrome.findElement(By.name("password")).clear();
				chrome.findElement(By.name("password")).sendKeys("123");
				chrome.findElement(By.className("blue_button")).submit();
//				chrome.close();
	}

}
