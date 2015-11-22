/**
 * @author Franz Profelt
 * @id s1410567019
 * @exercise 11
 */

package at.fhhagenberg.sqe.exercise11;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WidocSearchTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://research.fh-ooe.at/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testWidocSearch() throws Exception {
    // Franz Profelt
    // S1410567019
    driver.get(baseUrl + "/");
    driver.findElement(By.id("searchedFor")).click();
    driver.findElement(By.id("searchedFor")).clear();
    driver.findElement(By.id("searchedFor")).sendKeys("testing");
    driver.findElement(By.name("search")).click();
    driver.findElement(By.xpath("//ul[@id='subMenu']/li[4]/a")).click();
    try {
      assertEquals("(41)", driver.findElement(By.xpath("//ul[@id='subMenu']/li[4]/a/span")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.linkText("A testing procedure for htSNP approximation algorithms")).click();
    assertEquals("Widok | A testing procedure for htSNP approximation algorithms", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
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
