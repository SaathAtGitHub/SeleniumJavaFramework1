/* Following code is copied from "TestNG @DataProvider – Test parameters example" found at https://howtodoinjava.com/testng/testng-dataprovider/
 * 
 * As you can see from the above test results the test method was executed two times depending upon the data passed to it by DataProvider 
 * method. In this scenario the DataProvider method was in a different class. In such a case the dataProviderMethod() has to be declared 
 * static so that it can be used by a test method in a different class for providing data.
 * 
 * A Data Provider returns an array of objects.
 * 
 * TEST RESULT: I ran this test on January 16, 2020 and the result is PASS.
 * */
package interview;

import org.testng.annotations.Test;

public class DataProviderAndTestAnnotationsInDiffClass_2 
{
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderAndTestAnnotationsInDiffClass_1.class)
    public void testMethod(String data) 
    {
        System.out.println("Data is: " + data);
    }
}