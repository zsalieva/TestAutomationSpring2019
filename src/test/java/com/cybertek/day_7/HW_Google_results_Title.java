package com.cybertek.day_7;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;                       //  HoMeWorK Google search "Java", "JUnit", "REST Assured"
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.concurrent.TimeUnit;

public class HW_Google_results_Title {

    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {

       // test1();
          test2();

    }
        public static void test1() throws Exception{                                // TEST 2 Navigate to Java //

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
            //driver.findElement(By.tagName("btnK")).click();
            driver.navigate().to("http://www.java.com/");
            Thread.sleep(2000, 3);
            driver.navigate().back();
            Thread.sleep(2000, 3);
            driver.close();

        }

        //  List<String> searchStrs = Arrays.asList("Java", "JUnit", "REST Assured");

                                                                                    // TEST 2 Navigate to JUnit //
        public static void test2() throws Exception {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            driver.findElement(By.name("q")).sendKeys("JUnit", Keys.ENTER);
            //driver.findElement(By.tagName("btnK")).click();
            driver.navigate().to("https://junit.org/junit5/");
            Thread.sleep(2000, 3);
            driver.navigate().back();
            Thread.sleep(2000, 3);
            driver.close();
        }
        public static void test3() throws Exception {                             // TEST 3 Navigate to REST Assured //
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("REST Assured", Keys.ENTER);
        //driver.findElement(By.tagName("btnK")).click();
        driver.navigate().to("https://dictionary.cambridge.org/us/dictionary/english/rest-assured");
        Thread.sleep(2000, 3);
        driver.navigate().back();
        Thread.sleep(2000, 3);
        driver.close();
    }
    }

