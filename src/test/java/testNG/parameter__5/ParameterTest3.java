package testNG.parameter__5;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest3 {

    @Test
    @Parameters("browser")
    public void browserExecution(String browser){
        System.out.println("TesttNG XML file passed browser value is : "+browser);
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("Browser should open with : Chrome");
        }else if (browser.equalsIgnoreCase("edge")){
            System.out.println("Browser should open with : Edge");
        }else{
            System.out.println("Browser should open with : firefox");
        }
    }
}
