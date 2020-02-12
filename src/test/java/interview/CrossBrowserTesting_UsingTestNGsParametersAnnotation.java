/* Run "testng_CrossBrowserTesting_UsingTestNGsParametersAnnotation.xml" (located at this project's root) by right-clicking that XML file > Run As > TestNG Test, in order to run this test (If browser
 * fails to open up then try this: Click "Project" menu > click "Clean" > click "Ok").
 * I created this file while I watched this video upto  9:10: "Selenium Framework for Beginners 22 | Selenium TestNG | How to do Multiple Browser Parallel Testing" located
 * at https://www.youtube.com/watch?v=WZfh6v53leA&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=24
 */
package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting_UsingTestNGsParametersAnnotation {
	
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName){
		System.out.println("The Browser this test executed on is: " + browserName);
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.gecko.driver", projectPath + "\\driver\\geckodriver\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new ChromeDriver();   // Use this if u wish to run test on Chrome.
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectPath + "\\driver\\geckodriver\\geckodriver-v0.19.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();  // Use this if u wish to run test on FF.
		}
		else if(browserName.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", projectPath + "/driver/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
			driver = new InternetExplorerDriver();   // Use this if u wish to run test on IE.
		}
			
	}
	
	@Test
	public void test1() throws Exception{
		driver.get("https://google.com");
		// driver.findElement(By.xpath("xpath_goes_here"));  
		// Keep above line to answer Q in i-view, k which locators are available 
		Thread.sleep(4000);
	}

	@AfterTest
	public void teardown(){
		driver.close();
		System.out.println("Test completed successfully..");
	}
}
