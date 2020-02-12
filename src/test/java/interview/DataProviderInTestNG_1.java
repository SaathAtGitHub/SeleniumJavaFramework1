/* Following code is copied from "TestNG @DataProvider – Test parameters example" found at https://howtodoinjava.com/testng/testng-dataprovider/
 * A Data Provider returns an array of objects.
 */
package interview;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataProviderInTestNG_1 
{
	// The name of the DataProvider method is mentioned using the name attribute of the @DataProvider annotation, using the statement below. The DataProvider returns a double Object class array with two sets of data i.e. “data one” and “data two”.
    @DataProvider(name = "data-provider") // (https://examples.javacodegeeks.com/enterprise-java/testng/testng-dataprovider-example/) "Once we have added the method we need to annotate it using @DataProvider to let TestNG know that it is a DataProvider method. You can also provide a name to it using the name attribute of the DataProvider annotation but this is optional. If one hasn’t provided the name, name of the method will be used to refer to it."
    public Object[][] dataProviderMethod() 
    {
        return new Object[][] { { "data one" }, { "data two" }, { "data 3" }, { "data 4" } };  // A Data Provider returns an array of objects.
        /* As you can see from the above test result the respective test method in the class was executed four times. 
         * The execution of the test method is dependent upon the number of data-sets passed by the DataProvider method, 
         * in this case as four different sets of data were returned by the DataProvider, the test method was executed four times.
         * It is mandatory for a @DataProvider method to return the data in the form of double array of Object class (Object [][]). 
         * The first array represents a data set where as the second array contains the parameter values.
         */
    }
 
    @Test(dataProvider = "data-provider") // This test method takes one argument as input and prints it to console when executed. 
    public void testMethod(String data) 
    {
        System.out.println("Data is: " + data);
    }
}
