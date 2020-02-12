/* Listener_TestNGListenersClass.java is located in this "interview" package, where all TestNG's listeners (methods) are defined, that's why 
 * Listener_TestNGListenersClass.java is known as a "Listener Class".   
 * 
 * Created this file while I watched “Selenium Framework for Beginners 19 | Selenium TestNG How to get data from Excel using DataProvider” 
 * located at https://www.youtube.com/watch?v=02ANy2pu_ZA&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=21
 * 
 * TEST RESULT: Pass. Refer "2019 - How to code at work (Selenium) - 2019’s Prep" Google Docs file for detailed note taken while I watched this video.
 * This Google Docs file is located in Google Drive > QA > Selenium > At Work (Use these files at work). 
 */
package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo2 {
	
	@Test
	public void test4(){
		System.out.println("I'm inside Test 4");
	}
	
	@Test
	public void test5(){
		System.out.println("I'm inside Test 5");
	}
	
	@Test
	public void test6(){
		System.out.println("I'm inside Test 6");
		throw new SkipException("Test 6 is skipped.. ");
	}

}
