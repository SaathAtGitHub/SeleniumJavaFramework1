/* This code copied from "DataProvider in TestNG" at https://www.seleniumeasy.com/testng-tutorials/dataprovider-in-testng
 * 
 * TEST RESULT:
 * Ran this test on January 15, 2020 and it is a PASS. Belo is this test's result in TestNG:
 * =======================================
 * you have provided username as::sampleuser1
you have provided password as::sampleuser1_password

you have provided username as::testuser2
you have provided password as::testuser2_password

you have provided username as::guestuser3
you have provided password as::guestuser3_password

PASSED: setData("sampleuser1", "sampleuser1_password")
PASSED: setData("testuser2", "testuser2_password")
PASSED: setData("guestuser3", "guestuser3_password")

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Failures: 0, Skips: 0
===============================================
 */


package interview;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInTestNG{
	
	//This test method declares that its data should be supplied by the Data Provider
	// "getdata" is the function name which is passing the data
       // Number of columns should match the number of input parameters
	/* Following is copied from "TestNG @DataProvider – Test parameters example" found at https://howtodoinjava.com/testng/testng-dataprovider/: 
	 *
	 * An important features provided by TestNG is the testng DataProvider feature. It helps you to write data-driven tests which essentially means that same test method can be run multiple times with different data-sets.

Please note that @DataProvider is the second way of passing parameters to test methods except passing parameters from testng.xml. It helps in providing complex parameters to the test methods as it is not possible to do this from XML.

To use the DataProvider feature in the tests, you have to declare a method annotated by @DataProvider and then use the said method in the test method using the ‘dataProvider‘ attribute in the @Test annotation.
	 * An important features provided by TestNG is the testng DataProvider feature. It helps you to write data-driven tests which essentially means that same test method can be run multiple times with different data-sets.

Please note that @DataProvider is the second way of passing parameters to test methods except passing parameters from testng.xml. It helps in providing complex parameters to the test methods as it is not possible to do this from XML.

To use the DataProvider feature in the tests, you have to declare a method annotated by @DataProvider and then use the said method in the test method using the ‘dataProvider‘ attribute in the @Test annotation.
	 */
	@Test(dataProvider="getData") // (https://examples.javacodegeeks.com/enterprise-java/testng/testng-dataprovider-example/) "If a test wants to use the DataProvider, it can do so by specifying the name of the DataProvider in dataProvider attribute of @Test annotation."
	public void setData(String username, String password)
	{
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
		System.out.println();
	}

	@DataProvider // A Data Provider returns an array of objects.
	public Object[][] getData() 
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="sampleuser1";
	data[0][1] = "sampleuser1_password";

	// 2nd row
	data[1][0] ="testuser2";
	data[1][1] = "testuser2_password";
	
	// 3rd row
	data[2][0] ="guestuser3";
	data[2][1] = "guestuser3_password";

	return data; // A Data Provider returns an array of objects.
	}
}