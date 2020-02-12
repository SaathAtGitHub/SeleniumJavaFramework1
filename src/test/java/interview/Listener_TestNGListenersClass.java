/* This file is linked with "Listener_TestNGListenerDemo.java" by "@Listeners(interview.Listener_TestNGListenersClass.class)" statement, and it is located in this "interview" package. Run that file to see the result.
 * 
 * Created this file while I watched “Selenium Framework for Beginners 19 | Selenium TestNG How to get data from Excel using DataProvider” 
 * located at https://www.youtube.com/watch?v=02ANy2pu_ZA&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=21
 * 
 * Q: What is a  "Listener Class"?
 * A: This .java file / class is known as "Listener Class" since listeners (methods) are defined in this class.
 *   
 * TEST RESULT: Pass. Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package interview;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class Listener_TestNGListenersClass implements ITestListener {

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
