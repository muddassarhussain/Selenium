package seleniumframewrok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;


public class Test1 {
	private WebDriver driver;
	public String Title="";
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void vueBathroomSmokeClick() throws InterruptedException {
		driver.get("http://vue.bathroommountain.co.uk/antigua-gloss-white-combination-vanity-basin-and-seattle-toilet-1200mm");
	    driver.manage().window().setSize(new Dimension(1936, 1056));
//	    {
//	      WebElement element = driver.findElement(By.cssSelector(".familiar-brands"));
//	      Actions builder = new Actions(driver);
//	      builder.moveToElement(element).perform();
//	    }
//	    driver.findElement(By.cssSelector(".brand-detail:nth-child(2) h3")).click();
//	    driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) h1")).click();
//	    driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .sb-prodcut-name:nth-child(2)")).click();
//	    js.executeScript("window.scrollTo(0,0)");
	    Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".button-full:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".col-md-7 > .footer-btns-links > .btn-shopping")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".basket-icon .wishlist-text")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Go to Checkout")).click();
	    driver.findElement(By.name("first-name")).click();
	    driver.findElement(By.name("first-name")).sendKeys("Muddassar");
	    driver.findElement(By.name("last-name")).sendKeys("Hussain");
	    driver.findElement(By.name("email-address")).sendKeys("muddassar.hussainse@ki5.co.uk");
	    driver.findElement(By.cssSelector(".button-full")).click();
	    driver.findElement(By.id("search-bar")).click();
	    driver.findElement(By.id("search-bar")).sendKeys("ST6 4JU");
	    driver.findElement(By.name("city")).sendKeys("STOKE-ON-TRENT");
	    driver.findElement(By.name("phone-number")).sendKeys("03026983735");
	    driver.findElement(By.cssSelector(".find-address")).click();
	    {
	      WebDriverWait wait = new WebDriverWait(driver, 30);
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("crafty_postcode_lookup_result_option1")));
	    }
	    driver.findElement(By.id("crafty_postcode_lookup_result_option1")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("crafty_postcode_lookup_result_option1"));
	      dropdown.findElement(By.xpath("//option[. = 'TILE MOUNTAIN SHOWROOM, Brownhills Road, STOKE-ON-TRENT']")).click();
	    }
	    driver.findElement(By.cssSelector(".id-2021-02-26 .vc-day-content")).click();
	    driver.findElement(By.cssSelector(".col-md-5 > .no-outline")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".pl35")).click();
	    Thread.sleep(2000);
//	    driver.findElement(By.cssSelector(".col-md-12:nth-child(4) .checkmark")).click();
//	    boolean en = driver.findElement(By.cssSelector(".col-md-12:nth-child(4) .checkmark")).isEnabled();
//	    if(en=true) {
//	    	System.out.println("Button is enable");
//	    }else
//	    {
//	    	System.out.println("Button is not enable");
//	    }
////	    driver.switchTo().frame(2);
//	    Thread.sleep(4000);
//	    driver.findElement(By.id("checkout-frames-card-number")).click();
//	    boolean ele = driver.findElement(By.id("checkout-frames-card-number")).isSelected();
//	    if(en=true) {
//	    	System.out.println("text is enable");
//	    }else
//	    {
//	    	System.out.println("text is not enable");
//	    }
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("checkout-frames-card-number")).sendKeys("4242 4242 4242 4242");
//	    driver.switchTo().defaultContent();
//	    driver.switchTo().frame(3);
//	    driver.findElement(By.id("checkout-frames-expiry-date")).sendKeys("12/25");
//	    driver.switchTo().defaultContent();
//	    driver.switchTo().frame(4);
//	    driver.findElement(By.id("checkout-frames-cvv")).sendKeys("100");
//	    driver.switchTo().defaultContent();
//	    driver.findElement(By.id("pay-button")).click();
//	    driver.switchTo().frame(0);
//	    driver.findElement(By.id("password")).click();
//	    driver.findElement(By.id("password")).sendKeys("Checkout1!");
//	    driver.findElement(By.id("txtButton")).click();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}