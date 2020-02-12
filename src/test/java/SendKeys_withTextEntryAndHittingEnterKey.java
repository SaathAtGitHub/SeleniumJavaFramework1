/* On December 3, 2019, I copied the below code from this Selenium Help Docs: "The Selenium Browser Automation Project" at https://selenium.dev/documentation/en/
 * 
 * Q: Why you need a Gecko Driver?
 * A: Gecko Driver required ONLY IF you are running test(s) on Firefox version greater than 47.0. Firefox version less than 47.0 don't require
 * Gecko Driver. BTW use Gecko Driver, following statements required in order to run tests on Firefox > 47.0:
 * 
 * Use syntax below syntax for setting the property of Gecko driver:
 * System.setProperty("webdriver.gecko.driver", "path to gecko driver exe”);
 * 
 * Different versions of Gecko Drivers can be downloaded from: https://github.com/mozilla/geckodriver/releases. 
 * I downloaded Version 0.18, 0.19 and 0.26 - out of the 0.18 works good. Other versions can be found at https://github.com/mozilla/geckodriver/releases.
 * 
 * If you don't know from where to download GeckoDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download GeckoDriver.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class SendKeys_withTextEntryAndHittingEnterKey {

    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/geckodriver/geckodriver-v0.19.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            driver.get("https://google.com/ncr");
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>span"))); 
            System.out.println("\n****************************");
            System.out.println("The first link on the Search page is: " + firstResult.getAttribute("textContent"));
            System.out.println("****************************\n");
        } finally {
            driver.quit();
        }
    }
}