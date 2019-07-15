package com.cybertek.day6;
import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WarmUp {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) throws Exception {
       testWarmUp();
    }

    public static void testWarmUp()throws Exception {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple");
        driver.findElement(By.id("nav-input")).click();
        String title = driver.getTitle();
        String excpected = "Apple";

        if (title.equals(excpected)) {
            System.out.println("passed");
        } else {
            System.out.println("Im  Sorry");

            driver.close();
        }


    }}
