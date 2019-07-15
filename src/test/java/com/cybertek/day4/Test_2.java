package com.cybertek.day4;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

        public static void main(String[] args)throws Exception {
            // this line represents System.setProperty ..path
            WebDriverManager.chromedriver().setup();     // Setup Webdriver
            WebDriver driver = new ChromeDriver();      //Create obj of Chromedirver
            driver.manage().window().maximize();   //open browser maximized
            driver.get("http://practice.cybertekschool.com/forgot_password");  //open url
            WebElement emailInputbox =driver.findElement(By.name("email"));
            WebElement submitButton = driver.findElement(By.id("form_submit"));

            Faker faker = new Faker();
           //to enter email and enter
            String name = faker.pokemon().name().replace("","").toLowerCase();
            Thread.sleep(3000);
            //emailInputbox.sendKeys(faker.internet().emailAddress());

            emailInputbox.sendKeys(faker.funnyName().name()+"@gmail.com", Keys.ENTER); //enter text and press enter
            Thread.sleep(3000,22);
            emailInputbox.clear();
            Thread.sleep(3000,22);

            driver.close();
        }

    }


