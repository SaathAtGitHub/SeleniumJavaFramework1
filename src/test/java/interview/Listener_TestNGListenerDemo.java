/* Listener_TestNGListenersClass.java is located in this "interview" package, where all TestNG's listeners (methods) are defined, that's why 
 * Listener_TestNGListenersClass.java is known as a "Listener Class".   
 * 
 * Created this file while I watched “Selenium Framework for Beginners 19 | Selenium TestNG How to get data from Excel using DataProvider” 
 * located at https://www.youtube.com/watch?v=02ANy2pu_ZA&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=21
 * 
 * TEST RESULT: Pass (The error seen in white text, Raghav Pal is getting that error too - so don't worry for the error for now. BTW I'm getting long lines of errors beginning with "java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:96)" and the 2nd error I'm getting is this: "SKIPPED: test3
org.testng.SkipException: Test 3 is skipped.. "). Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package interview;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(interview.Listener_TestNGListenersClass.class) // Here you need to specify your listener class (where you have all the listeners methods) with package name first.
public class Listener_TestNGListenerDemo {
	
	@Test
	public void test1(){
		System.out.println("I'm inside Test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("I'm inside Test 2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3(){
		System.out.println("I'm inside Test 3");
		throw new SkipException("Test 3 is skipped.. ");
	}

}
