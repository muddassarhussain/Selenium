package seleniumframewrok;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFramewrok13TestNGRecorderTileMountain {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testTileMountainHomeToCheckout() throws Exception {
    driver.get("https://bathroommountain.co.uk/");
    driver.findElement(By.id("search")).click();
    driver.findElement(By.id("search")).clear();
    driver.findElement(By.id("search")).sendKeys("33010");
    driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("search")).clear();
    driver.findElement(By.id("search")).sendKeys("");
    driver.findElement(By.xpath("(//img[@alt='Gibraltar Slimline Small White Traditional Heated Towel Radiator (Flat Top Rail)'])[3]")).click();
    driver.findElement(By.className("addtocart-popup")).click();
    driver.findElement(By.xpath("//div[@id='pupupid']/div/div[2]/div/div/div/div[4]/div[2]/div/button")).click();
    driver.findElement(By.xpath("//div[@id='viewport']/div/header/div[2]/div/div[5]/div/button[2]/div/div/span/img")).click();
    driver.findElement(By.linkText("Go to Checkout")).click();
    driver.findElement(By.name("first-name")).clear();
    driver.findElement(By.name("first-name")).click();
    driver.findElement(By.name("first-name")).sendKeys("Muddassar");
    driver.findElement(By.name("last-name")).clear();
    driver.findElement(By.name("last-name")).sendKeys("Hussain");
    driver.findElement(By.name("email-address")).clear();
    driver.findElement(By.name("email-address")).sendKeys("muddassar.hussainse@ki5.co.uk");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.id("search-bar")).click();
    driver.findElement(By.id("search-bar")).clear();
    driver.findElement(By.id("search-bar")).sendKeys("st6 4ju");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    driver.findElement(By.id("crafty_postcode_lookup_result_option1")).click();
    new Select(driver.findElement(By.id("crafty_postcode_lookup_result_option1"))).selectByVisibleText("TILE MOUNTAIN SHOWROOM, Brownhills Road, STOKE-ON-TRENT");
    driver.findElement(By.name("phone-number")).click();
    driver.findElement(By.name("phone-number")).clear();
    driver.findElement(By.name("phone-number")).sendKeys("135156542");
    driver.findElement(By.xpath("//div[@id='checkout']/div[3]/div/div/div[3]/div[3]/div/form/div[14]/div/div/div/div/div[2]/div[27]/div/div/span")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("//div[@id='checkout']/div[3]/div/div/div[4]/div[3]/div/div[2]/form/div/div/label")).click();
//    driver.findElement(By.id("sendToShippingAddressCheckbox")).click();
    driver.findElement(By.xpath("//*[@id='checkout']/div[3]/div/div[1]/div[4]/div[3]/div/div[2]/form/div[1]/div[1]/label")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.id("checkout-frames-card-number")).click();
    driver.findElement(By.id("checkout-frames-card-number")).clear();
    driver.findElement(By.id("checkout-frames-card-number")).sendKeys("4242 4242 4242 4242");
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]
    driver.findElement(By.id("checkout-frames-expiry-date")).clear();
    driver.findElement(By.id("checkout-frames-expiry-date")).sendKeys("12/25");
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=4 | ]]
    driver.findElement(By.id("checkout-frames-cvv")).clear();
    driver.findElement(By.id("checkout-frames-cvv")).sendKeys("100");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
	Thread.sleep(5000);
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
