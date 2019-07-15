package com.cybertek.day5;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsPracticeClassName {

    static WebDriver driver = new BrowserFactory().getDriver("chrome");

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");
      List<WebElement> examples = driver.findElements(By.className("list-group-item"));
        for(WebElement elements: examples){
            System.out.println(elements.getText());
        }
        driver.close();
        }

    }

