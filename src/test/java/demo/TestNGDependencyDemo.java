/* This file is created while I watched “Selenium Framework for Beginners 25 | TestNG How to create Dependencies” located 
 * at https://www.youtube.com/watch?v=jxZEYBOGxuM&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=27
 * 
 * TEST RESULT: Pass. 
 * (I ran test on February 2, 2020). For detailed Notes with SS, check Google Docs file named 
 * as "2019 - How to code at work (using Selenium and TestNG) - 2019’s Prep - 2" > saved in Google Drive.
 */
package demo;
import org.testng.annotations.Test;

public class TestNGDependencyDemo {

	@Test(dependsOnGroups = "sanity.*" )
	public void test1(){		System.out.println("I'm inside test1 from 'demo.TestNGDependencyDemo.java.");	}
	
	@Test(groups = "sanity ")
	public void test2(){		System.out.println("I'm inside test2 from 'demo.TestNGDependencyDemo.java.");	}
	
	@Test(groups = "sanity2")
	public void test3(){		System.out.println("I'm inside test3 from 'demo.TestNGDependencyDemo.java.");	}
	
}
