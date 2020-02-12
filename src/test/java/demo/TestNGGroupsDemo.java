package demo;

import org.testng.annotations.Test;

@Test(groups = { "AllClassTests" }) 
// Above is how you can define class level groups, meaning test1 is part of "sanity" as well as "AllClassTests" group. Same way test2 is now 
// part of "sanity" as well as "AllClassTests" group, test3 is part of "linux.regression" as well as "AllClassTests" group and test4 is now
// assigned a group which is "linux.regression" group.
public class TestNGGroupsDemo {

	@Test(groups = { "sanity" })
	public void test1(){		System.out.println("This is test1 from 'demo.TestNGGroupsDemo.java'..");	}
	
	@Test(groups = { "windows.regression" }) 
	// "windows.regression" meaning this test is part of regression but will run on Windows systems only.
	// Always give a group's name like above whenever you have tests that you want to run on different platforms like Windows, Linux, etc. so you
	// can run tests platform wise by including them in XML file using include tage this way: <include name="windows.*"></include>
	public void test2(){		System.out.println("This is test2 from 'demo.TestNGGroupsDemo.java'..");	}
	
	@Test(groups = { "linux.regression" })  // "linux.regression" meaning this test is part of regression but will run on Linux systems only.
	public void test3(){		System.out.println("This is test3 from 'demo.TestNGGroupsDemo.java'..");	}
	
	@Test
	public void test4(){		System.out.println("This is test4 from 'demo.TestNGGroupsDemo.java'..");	}
}
