/* If you don't know from where to download ChromeDriver then simply comment out that statement and run your test, you will get error. Now the error
 * itself give you the URL from where you can download ChromeDriver.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome_RunningTestOnChromeWithChromeDriver {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"

		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe"); // If this don't work then use above statement
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		
		driver.get("https://www.seleniumhq.org/");
		// On above line, U will get error in Firefox browser even if u r using latest Gecko driver version 26.0, also version 18.0 gives error 
		// in Eclipse. Solution is use Gecko Driver version 19.0 (as of Nov 8, 2019)
		
		// driver.close();
	}
}
