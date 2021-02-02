package seleniumframewrok;

import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testtilemountain{
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts();
  }

  @Test
  public void testSeleniumFramewrok13TestNGRecorderTileMountain() throws Exception {
    driver.get("http://vue.bathroommountain.co.uk/");
    driver.findElement(By.xpath("//div[@id='home']/div[3]/div/div/a[2]/div/div")).click();
    driver.findElement(By.xpath("//img[contains(@src,'http://vue.bathroommountain.co.uk/img/400/400/resize/catalog/category/72021-L.jpg')]")).click();
    driver.findElement(By.xpath("(//img[@alt='Monaco Slate Grey Floor Standing Tall Cabinet Unit 300mm'])[3]")).click();
    driver.findElement(By.className("addtocart-popup")).click();
    driver.findElement(By.xpath("//div[@id='pupupid']/div/div[2]/div/div/div/div[2]/div[2]/div/button")).click();
    driver.findElement(By.xpath("//div[@id='viewport']/div/header/div[2]/div/div[5]/div/button[2]/div/div[2]/span")).click();
    driver.findElement(By.linkText("Go to Checkout")).click();
    driver.findElement(By.name("first-name")).click();
    driver.findElement(By.name("first-name")).clear();
    driver.findElement(By.name("first-name")).sendKeys("Muddassar");
    driver.findElement(By.name("last-name")).click();
    driver.findElement(By.name("last-name")).clear();
    driver.findElement(By.name("last-name")).sendKeys("Hussain");
    driver.findElement(By.xpath("//div[@id='checkout']/div/div/div/div/div/div[2]/div/div[2]/div[3]")).click();
    driver.findElement(By.name("email-address")).click();
    driver.findElement(By.name("email-address")).clear();
    driver.findElement(By.name("email-address")).sendKeys("muddassar.hussainse@ki5.co.uk");
    driver.findElement(By.id("search-bar")).click();
    driver.findElement(By.id("search-bar")).clear();
    driver.findElement(By.id("search-bar")).sendKeys("ST64JU");
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.className("find-address")).click();
    driver.findElement(By.id("crafty_postcode_result_display_1")).click();
    new Select(driver.findElement(By.id("crafty_postcode_lookup_result_option1"))).selectByVisibleText("TILE MOUNTAIN SHOWROOM, Brownhills Road, STOKE-ON-TRENT");
    driver.findElement(By.name("phone-number")).click();
    driver.findElement(By.name("phone-number")).clear();
    driver.findElement(By.name("phone-number")).sendKeys("03026983735");
    driver.findElement(By.xpath("(//input[@name='phone-number'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@name='phone-number'])[2]")).sendKeys("03026983735");
    driver.findElement(By.xpath("//div[@id='checkout']/div/div/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div[26]/div/div/span")).click();
    driver.findElement(By.xpath("//button[@id='shippingSubmitBtnId']/span/span")).click();
    driver.findElement(By.xpath("//div[@id='radioStyled']/div[2]/div/div/div[2]/label")).click();
    Thread.sleep(2000);
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
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.id("pay-button")).click();
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
