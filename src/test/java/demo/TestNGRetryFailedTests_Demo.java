/* Watching “Selenium Framework for Beginners 27 | TestNG How to Rerun (Retry) Failed tests | Selenium Framework” located 
 * at https://www.youtube.com/watch?v=9eUKJ5Nb7ag&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=29
 * 
 * When you nighly run your test suite and if server is down, and when you check in the morning, you find that some of your tests are failed for some other non-script related 
 * issues like server was down, or application was very slow or net was down, etc). In that case, you simply need to re-run those failed tests and they all will pass. That's when
 * "Retry Analyzer" is used to re-run those failed tests / methods.
 * 
 * "RetryAnalyzer_ForRerunningFailedTests.java" (located in "listeners" package) is a "Retry Analyzer" class / file. In order to use "Retry Analyzer" you need to use following @Test annotation for the methods 
 * that is failed (e.g., in over nightly run, you will have failed tests if your server is down so rerunning those tests / methods is best option, using following @Test annotation):
 *             @Test(retryAnalyzer = listeners.RetryAnalyzer_ForRerunningFailedTests.class)
 *         
 * I've used above @Test annotation statement in this file.
 *  
 * TEST RESULT: Pass. As noted above, to see the result, you need to run "TestNGRetryFailedTests_Demo.java" file located in "Demo" package.
 */
package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import listeners.RetryAnalyzer_ForRerunningFailedTests;

public class TestNGRetryFailedTests_Demo {

	@Test
	public void test1()
	{
		System.out.println("In test1..");
	}
	
	@Test
	public void test2()
	{
		System.out.println("In test2..");
		// int i=1/0;
	}
	
	@Test(retryAnalyzer = listeners.RetryAnalyzer_ForRerunningFailedTests.class)
	public void test3()
	{
		System.out.println("In test3..");
//		Assert.assertTrue(false); // This is how you fail a test by giving "false" boolean valur OR by giving wrong condition
		Assert.assertTrue(0>1);  // This is how you fail a test by giving "false" boolean valur OR by giving wrong condition
	}
}
 