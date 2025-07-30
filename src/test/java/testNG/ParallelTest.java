package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

    @Test(priority = 0)
    public void openGoogle(){
        System.out.println("Open Google");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akila\\Downloads\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.quit();
    }

    @Test(priority = 1)
    public void openBing(){
        System.out.println("Open Bing");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\akila\\Downloads\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bing.com");
        driver.quit();
    }
}
