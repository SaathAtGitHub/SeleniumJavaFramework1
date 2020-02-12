/* Created this file while watching this video: “Selenium Framework for Beginners 13 | Selenium What is testng.xml | How to create testng.xml” 
 * located at https://www.youtube.com/watch?v=gBpLmQgkqsw&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=15
 * 
 * TEST RESULT: Pass and it successfully opened IE browser, navigated to Google.com, entered "ABCD" in the search box ("ABCD" getting typed slowly - the
 * reason may be IDdriver issue, or WebDriver and IEdriver related conflict, it could be anything for which I didn't gave time) and then ENTER 
 * key is clicked. After typing "ABCD" (or anything) in the search box, Google will show auto-suggestion which will block the view of
 * "Google Search" button, as a result "Google Search" button won't be clicked. To avoid that, we used "sendKeys" method - check this: "driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);"
 * 
 * Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true); 
		// For above statement, Raghav referred this online help docs: "DesiredCapabilities" at https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
		
		System.setProperty("webdriver.ie.driver", projectPath + "/driver/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);   // Use this if u wish to run test on IE. 
		// This test runs successfully, even though I'm getting "The constructor InternetExplorerDriver(Capabilities) is deprecated" in above statement.
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		// driver.close();
		// driver.quit();

	}

}
