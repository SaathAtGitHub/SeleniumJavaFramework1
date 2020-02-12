/* Following files are linked with this file:
 * 1) "TestNGRetryFailedTests_Demo.java" file, located in "demo" package.
 * 2) RetryFailedTests_UsingRetryAnalyzer_Demo.java located in "interview" package.
 * 
 * Watching “Selenium Framework for Beginners 27 | TestNG How to Rerun (Retry) Failed tests | Selenium Framework” located 
 * at https://www.youtube.com/watch?v=9eUKJ5Nb7ag&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=29
 * 
 * This is a "Retry Analyzer" class / file. In order to use this "Retry Analyzer" you need to use following @Test annotation for the methods 
 * that is failed (e.g., in over nightly run, you will have failed tests if your server is down so rerunning those tests / methods is best option, using following @Test annotation):
 *             @Test(retryAnalyzer = listeners.RetryAnalyzer_ForRerunningFailedTests.class)
 *             
 * TEST RESULT: Pass. As noted above, to see the result, you need to run "TestNGRetryFailedTests_Demo.java" file located in "Demo" package.
 */
package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;


public class RetryAnalyzer_ForRerunningFailedTests implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 3;
	 
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}
