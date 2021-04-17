package seleniumframewrok;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VueBathroomSmokeClickOffice {
	private WebDriver driver;
	public String Title="";
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void vueBathroomSmokeClick() throws InterruptedException {
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(1936, 1056));
		driver.get("http://vue.bathroommountain.co.uk");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		Title=driver.getTitle();
		String expectedTitle=Title;
		if(Title.contentEquals(expectedTitle)) {
			System.out.println("Title is fine");
		}else
		{
			System.out.println("Title isn't fine");
		}
		
		driver.findElement(By.cssSelector(".familiar-brands"));
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".brand-detail:nth-child(2) h3")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".col-sm-6:nth-child(2) h1")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//	driver.findElement(By.xpath("//img[@alt='Antigua Gloss White Combination Vanity Basin And Seattle Toilet 1200mm']")).click();
		//	driver.findElement(By.xpath("//div[@id='category']/div[2]/div/div[2]/div[2]/div/div/div/a/p")).click();
		//	driver.findElement(By.cssSelector(".col-sm-6:nth-child(1) .sb-prodcut-name:nth-child(2)")).click();
		driver.findElement(By.xpath("//p[contains(.,'Antigua Gloss White Combination Vanity Basin And Seattle Toilet 1200mm')]")).click();
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Go to Checkout")).click();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("first-name")).click();
		driver.findElement(By.name("first-name")).sendKeys("Muddassar");
		Thread.sleep(1000);
		driver.findElement(By.name("last-name")).sendKeys("Hussain");
		Thread.sleep(1000);
		driver.findElement(By.name("email-address")).sendKeys("muddassar.hussainse@ki5.co.uk");
		driver.findElement(By.cssSelector(".button-full")).click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.id("search-bar")).click();
		driver.findElement(By.id("search-bar")).sendKeys("ST6 4JU");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("city")).sendKeys("STOKE-ON-TRENT");
		driver.findElement(By.name("phone-number")).sendKeys("03026983735");
		driver.findElement(By.cssSelector(".find-address")).click();
		Thread.sleep(2000);
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("crafty_postcode_lookup_result_option1")));
		}
		driver.findElement(By.id("crafty_postcode_lookup_result_option1")).click();
		Thread.sleep(2000);
		{
			WebElement dropdown = driver.findElement(By.id("crafty_postcode_lookup_result_option1"));
			dropdown.findElement(By.xpath("//option[. = 'TILE MOUNTAIN SHOWROOM, Brownhills Road, STOKE-ON-TRENT']")).click();
		}
		driver.findElement(By.cssSelector(".id-2021-02-26 .vc-day-content")).click();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".col-md-5 > .no-outline")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".pl35")).click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".col-md-12:nth-child(4) .checkmark")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(2);
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout-frames-card-number")));
		}
		driver.findElement(By.className("card-number")).click();
//		driver.findElement(By.id("checkout-frames-card-number")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("card-number")).sendKeys("4242 4242 4242 4242");
//		driver.findElement(By.id("checkout-frames-card-number")).sendKeys("4242 4242 4242 4242");
		Thread.sleep(1000);
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(3);
		driver.findElement(By.id("checkout-frames-expiry-date")).sendKeys("12/25");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(4);
		driver.findElement(By.id("checkout-frames-cvv")).sendKeys("100");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("pay-button")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Checkout1!");
		Thread.sleep(2000);
		driver.findElement(By.id("txtButton")).click();
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}