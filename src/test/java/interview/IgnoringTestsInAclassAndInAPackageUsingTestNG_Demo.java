/* This file is created while I watched “Selenium Framework for Beginners 25 | TestNG How to create Dependencies” located 
 * at https://www.youtube.com/watch?v=jxZEYBOGxuM&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=27
 * 
 * TEST RESULT: Pass / Fail. 
 * (I ran test on , 2020) For detailed Notes with SS, check Google Docs file named 
 * as "2019 - How to code at work (using Selenium and TestNG) - 2019’s Prep - 2" > saved in Google Drive.
 * 
 * ------------ Following is copied from Javadocs / by typing "@Ignore" and then hit Ctrl + Spacebar --------------
 * Alternative of @Test(enabled=false) 
Notice that @Ignore on a class will disable all test methods of the class. 

Ignoring a class will ignore tests from child classes too. 

Ignoring a package will ignore all tests in the package and its sub-packages 

A package annotation is done in package-info.java. For example: 
 @Ignore
 package test.ignorePackage;

 import org.testng.annotations.Ignore;
--------------------------------------------------------------------------------------------------------------------
 */
package interview;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoringTestsInAclassAndInAPackageUsingTestNG_Demo {

	@Test
	public void test1(){		System.out.println("I'm inside test1 from 'demo.TestNGDependencyDemo.java.");	}
	
	@Test
	public void test2(){		System.out.println("I'm inside test2 from 'demo.TestNGDependencyDemo.java.");	}
	
	@Test
	public void test3(){		System.out.println("I'm inside test3 from 'demo.TestNGDependencyDemo.java.");	}
	
}