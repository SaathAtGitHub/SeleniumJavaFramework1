/* This file is created while I watched “Selenium Framework for Beginners 25 | TestNG How to create Dependencies” located 
 * at https://www.youtube.com/watch?v=jxZEYBOGxuM&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=27
 * 
 * TEST RESULT: Pass / Fail. (I ran test on , 2020)
 */
package interview;
import org.testng.annotations.Test;

public class Dependency_TestNGDependencyDemo {

	@Test(dependsOnGroups = "sanity.*" )
	public void test1(){		System.out.println("I'm inside test1 from 'demo.TestNGDependencyDemo.java.");	}
	
	@Test(groups = "sanity ")
	public void test2(){		System.out.println("I'm inside test2 from 'demo.TestNGDependencyDemo.java.");	}
	
	@Test(groups = "sanity2")
	public void test3(){		System.out.println("I'm inside test3 from 'demo.TestNGDependencyDemo.java.");	}
	
}
