/* Q: Why you need a Gecko Driver?
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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_RunningTestOnFirefoxWithGeckoDriver {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
		
		/* Different versions of Gecko Drivers can be downloaded from: https://github.com/mozilla/geckodriver/releases. 
		 * I downloaded Version 0.18, 0.19 and 0.26 - out of the 0.18 works good. Other versions can be found at https://github.com/mozilla/geckodriver/releases.
		 */
		// Use syntax below syntax for setting the property of Gecko driver
		// System.setProperty("webdriver.gecko.driver", "path to gecko driver exe”);
		// System.setProperty("webdriver.gecko.driver", "C:\\Selenium - 2019's Prep\\SeleniumJavaFramework\\driver\\geckodriver\\geckodriver-v0.18.0-win64geckodriver.exe");
		   System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver/geckodriver-v0.19.0-win64/geckodriver.exe"); 
		// System.setProperty("webdriver.gecko.driver", "C:\\Selenium - 2019's Prep\\SeleniumJavaFramework\\driver\\geckodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		// Gecko Driver version 26.0 in above line don't work as it failed to open Firefox.
		WebDriver driver = new FirefoxDriver();  // Use this if u wish to run test on FF.
		
		// WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		driver.get("https://www.seleniumhq.org/"); // As of December 3, 2019 this URL redirects to https://selenium.dev/, looks like they have changed URL and the UI as well.
		// On above line, U will get error in Firefox browser even if u r using latest Gecko driver version 26.0, also version 18.0 gives error 
		// in Eclipse. Solution is use Gecko Driver version 19.0 (as of Nov 8, 2019)
		
		// driver.close();  // This will close current FF window.
		// drive.quit(); // This will close all FF windows.
	}
}
