package simple.calculator.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticOperatorDataProviderTest {

    @Test(dataProvider = "DataSet")
    public void testSum(int input1, int input2, int expectedOutput){
        Assert.assertEquals(ArithmeticOperator.calSum(input1,input2),expectedOutput, "Failed to calculate sum");
    }


    @DataProvider(name = "DataSet")
    public Object[][] getData(){
        Object[][] data = {
                {0,1,1},
                {0,-1,-1},
                {-2147483647,-1,-2147483648},
                {2147483646,1,2147483647}
        };
        return data;
    }
}
