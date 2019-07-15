package com.cybertek.day4;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {


            public static void main(String[] args)throws Exception {
                // this line represents System.setProperty ..path
                WebDriverManager.chromedriver().setup();     // Setup Webdriver
                WebDriver driver = new ChromeDriver();      //Create obj of Chromedirver
                driver.manage().window().maximize();   //open browser maximized
                driver.get("http://practice.cybertekschool.com/forgot_password");  //open url
                WebElement emailInputbox =driver.findElement(By.name("email"));
                WebElement submitButton = driver.findElement(By.id("form_submit"));

                emailInputbox.sendKeys("sdetpro3000@gmail.com");
                submitButton.submit(); // it only works with buttos
                System.out.println(emailInputbox.getAttribute("paterrn"));
                System.out.println(emailInputbox.getAttribute("value"));

                // to read value of attribute
                Thread.sleep(2000);

                driver.close();
            }

        }




