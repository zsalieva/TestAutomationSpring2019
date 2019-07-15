package com.cybertek.VYTRACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


public class LogInLogOut {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {
                      PositiveTestCase();
                    //  NegativeTestCase();
                   //PositiveTestCaseLogOut();
    }


    public static void PositiveTestCase() throws InterruptedException {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa2.vytrack.com/user/login");

        Thread.sleep(3000,2);

        driver.findElement(By.id("prependedInput")).sendKeys("user39");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        String excpectedResult= driver.getTitle();
        String actualResult ="Dashboard";  // Actual Result matches with excpected result Dashbord
        SeleniumUtils.verifyEquals(excpectedResult,actualResult);





    }


    public static void NegativeTestCase()throws Exception {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(3000,2);

        driver.findElement(By.id("prependedInput")).sendKeys("user1");    // Wrong login
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser12");  //Wrong password
        driver.findElement(By.id("_submit")).click();
        String excpectedResult1 = "Dashboard";                             //Excpected result Dashboard
        String actualResult1 = driver.getTitle();                          // Actual Result login   Not pAssed
        SeleniumUtils.verifyEquals(excpectedResult1, actualResult1);      // Comparing Excpected with actual Result


    }
    public static void PositiveTestCaseLogOut()throws Exception{

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa2.vytrack.com/user/login");  //Go to URL
        Thread.sleep(3000,2);

        driver.findElement(By.id("prependedInput")).sendKeys("user39");  //Login
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"); //Log out
        driver.findElement(By.id("_submit")).click();    //Enter the button to logOut
        driver.findElement(By.id("user-menu")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();  // xpath to logOut from page
        String ActualLogOutResult =driver.getTitle();
        String expectedLogOutResult ="Login";
        SeleniumUtils.verifyEquals(expectedLogOutResult, ActualLogOutResult);      // Comparing Excpected with actual Result


    }

    }



