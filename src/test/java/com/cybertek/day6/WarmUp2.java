package com.cybertek.day6;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class WarmUp2 {


        static WebDriver driver = BrowserFactory.getDriver("chrome");

        public static void main(String[] args) throws Exception {
            testWarmUp();
        }

        public static void testWarmUp()throws Exception {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("http://www.wikipedia.org");
            Thread.sleep(2000);
            driver.findElement(By.id("searchInput")).sendKeys(" selenium webdriver",Keys.ENTER);
            driver.findElement(By.id("typeahead-suggestion")).click();
            String title = driver.getTitle();
            String excpected = "selenium webdriver";

            if (title.equals(excpected)) {
                System.out.println("passed");
            } else {
                System.out.println("Im  Sorry");
            }


            driver.close();

        }

    }


