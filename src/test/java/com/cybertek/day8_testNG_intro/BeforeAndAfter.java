package com.cybertek.day8_testNG_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter {

        WebDriver driver;


        @BeforeMethod    // we can change it to BeforeMethod to BeforeTest to check the second test.
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://google.com");
        }

        @Test
        public void test1(){
            Assert.assertTrue(driver.getTitle().contains("Google"));
        }
    @Test
    public void test2(){
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
    }

        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

    }

