package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import com.cybertek.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeID {



      static  WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception{
        test1();

    }
    // Negative testing we will use Wrong id to locate element

    public static void test1() throws Exception{
        driver.manage().window().maximize();
        //Selenium wait for 10seconds for element
        // if, whitin 10 seconds, elemnets will not show up
        // you will get NoSuch ElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.id("woodenspoon"));
        Thread.sleep(3000,2);
        driver.quit();

    }

    public static void test2()throws Exception{
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPasword");
        driver.findElement(By.id("wooden_spoon"));
        Thread.sleep(3000,2);

        // this is a like a test ,lets say in the test case we had a requirement to verify this message
        String  expectedMessage ="Welcome to the secure Area.When you are done click logout below";
        String  actualMessage = driver.findElement(By.className("subheader")).getText();
        SeleniumUtils.verifyEquals(expectedMessage,actualMessage);
        driver.findElement(By.linkText("Logout")).click();
        driver.quit();
    }
}
