/* Listener_TestNGListenerDemo.java is located in this "listeners" package. Run that file to see the result.
 * 
 * Created this file while I watched “Selenium Framework for Beginners 19 | Selenium TestNG How to get data from Excel using DataProvider” 
 * located at https://www.youtube.com/watch?v=02ANy2pu_ZA&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=21
 * 
 * TEST RESULT: Pass. Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onFinish(ITestContext arg0) {		System.out.println("******** onFinish Method: Test completed.. " + arg0.getName()); 	}

	public void onStart(ITestContext arg0) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("******** onTestFailure Method: Test FAILED.. " + arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("******** onTestSkpped Method: Test skipped.. " + arg0.getName());
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("******** onTestStart Method: Test strted.. " + arg0.getName());
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("******** onTestSuccess Method: Test is successful.. " + arg0.getName());
	}
}
