/* This file is created while I watched “Selenium Framework for Beginners 21 | Selenium TestNG | How to set Priority” located 
 * at https://www.youtube.com/watch?v=ettBHs_ek8o&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=23
 * 
 * This file's name in above video is "PriorityInTestNG_Demo" which I changed to "PriorityInTestNG_Demo".
 * TEST RESULT: It is passs. (I ran test on January 19, 2020)
 */
package demo;
import org.testng.annotations.Test;

public class PriorityInTestNG_Demo {

	@Test 
	public void test1(){		System.out.println("I'm inside test1.");	}
	
	@Test
	public void test4(){		System.out.println("I'm inside test4.");	}
	
	@Test
	public void test5(){		System.out.println("I'm inside test5.");	}
	
	@Test (priority = 6)
	public void test2(){		System.out.println("I'm inside test2.");	}
	
	@Test (priority = 2)
	public void test3(){		System.out.println("I'm inside test3.");	}

	@Test (priority = 1)
	public void A(){		System.out.println("I'm inside test6.");	}
}
