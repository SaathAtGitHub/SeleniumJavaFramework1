/* If you don't know from where to download InternetExplorerDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download InternetExplorerDriver.
 * 
 * Problem: When you try to run test on IE, you get the following error: 
 * Unexpected error launching Internet Explorer. Protected Mode settings are not the same for all zones. Enable Protected Mode must be set to the same value (enabled or disabled) for all zones.

Solution: Now the error itself gives the solution. To fix, follow the steps below:
Open IE > Tools > Internet Options > click “Security” tab > make sure “Enable Protected Mode (requires restarting Internet Explorer)” IS UNCHECKED (as suggested by Raghav @ 7:16 in this video) for Internet, Local intranet, Trusted sites and Restricted sites zones - Check the SS below. Then re-run the test. (I kept “Enable Protected Mode (requires restarting Internet Explorer)” CHECKED for all the four zones and re-run my test and it ran without any error.)
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_RunningTestOnIEWithInternetExplorerDriver {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		System.setProperty("webdriver.ie.driver", projectPath + "/driver/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();   // Use this if u wish to run test on IE.
		
		driver.get("https://www.seleniumhq.org/");
		// On above line, U will get error in Firefox browser even if u r using latest Gecko driver version 26.0, also version 18.0 gives error 
		// in Eclipse. Solution is use Gecko Driver version 19.0 (as of Nov 8, 2019)
		
		// driver.close();
	}
}
