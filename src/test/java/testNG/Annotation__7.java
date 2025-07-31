package testNG;

import org.testng.annotations.*;

public class Annotation__7 {
    @Test
    public void test1() {
        System.out.println("Im test 1");
    }

    @Test
    public void test2(){
        System.out.println("Im test 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Im before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Im after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Im before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Im after class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Im before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Im after suite");
    }
}
