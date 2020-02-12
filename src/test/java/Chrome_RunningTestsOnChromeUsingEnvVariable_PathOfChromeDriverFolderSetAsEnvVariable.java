import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* In "Watching “Selenium Framework for Beginners 3 | How to run Selenium tests on Chrome Browser” 
 * located at https://www.youtube.com/watch?v=mS8E_cZVK1c&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=3, @ 11:00 Raghav Pal explains how to set and append PATH 
 * of the folder (where chromedriver.exe is located) in "path" environment variable. By doing so we won't have to use "System.setProperty();" statement every time 
 * when we want to run our tests on Google Chrome. I've appended the path of my chromedriver.exe in "Path" environment variable which is accessible by clicking 
 * Windows button (in Windows 7) > bright click "Computer" > Properties > click "Advanced system settings" > under "Advanced" tab, click "Environment Variables" 
 * button > under "System variables" find "Path" > click "Edit..." > in "Variable value" field, I appended a semicolon first > then I appended appended the path 
 * of my chromedriver.exe > Keep hitting OK button until you come all the way out.  
 *  *  Same is applicable to IEDriver, the only difference is you need to give path of IEDriver's location.
 */

public class Chrome_RunningTestsOnChromeUsingEnvVariable_PathOfChromeDriverFolderSetAsEnvVariable {

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println("Location of this project is: " + projectPath + "\n");  // This will print "C:\Selenium - 2019's Prep\SeleniumJavaFramework"
		//C:\Selenium - 2019's Prep\SeleniumJavaFramework\driver\ChromeDriverVersion2.9\chromedriver.exe
		/* Different versions of Gecko Drivers can be downloaded from: https://github.com/mozilla/geckodriver/releases. 
		 * I downloaded Version 0.18, 0.19 and 0.26 - out of the 0.18 works good. Other versions can be found at https://github.com/mozilla/geckodriver/releases.
		 */
		// Use syntax below for setting the property of Gecko driver
		// System.setProperty("webdriver.gecko.driver", "path to gecko driver exe”);
		// System.setProperty("webdriver.gecko.driver", "C:\\Selenium - 2019's Prep\\SeleniumJavaFramework\\driver\\geckodriver\\geckodriver-v0.18.0-win64geckodriver.exe");
		// System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver/geckodriver-v0.19.0-win64/geckodriver.exe"); // If I'm running test on Firefox > 47.0, then I need this statement.
		// System.setProperty("webdriver.gecko.driver", "C:\\Selenium - 2019's Prep\\SeleniumJavaFramework\\driver\\geckodriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		// Gecko Driver version 26.0 in above line don't work as it failed to open Firefox.
		// WebDriver driver = new FirefoxDriver();  // Use this if u wish to run test on FF.
		
		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 78.0.3904.70/chromedriver.exe");
		// System.setProperty("webdriver.chrome.driver", projectPath + "/driver/Chrome Driver Version 2.36/chromedriver.exe");
		// Raghav Pal used Chrome Driver Version 2.9 but it was showing "data:," in Chrome's address bar so he suggested to use version 2.36 which fixed the issue. Also Chrome Driver Version 78.0.3904.70 works as I tried it. As of Nov 9, 2019 this is the latest Chrome Driver. 
		WebDriver driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		
		driver.get("https://www.seleniumhq.org/");
		// On above line, U will get error in Firefox browser even if u r using latest Gecko driver version 26.0, also version 18.0 gives error 
		// in Eclipse. Solution is use Gecko Driver version 19.0 (as of Nov 8, 2019)
		
		// driver.close();
	}
}
