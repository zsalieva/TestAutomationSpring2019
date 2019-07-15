package com.cybertek.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

    public static void main(String[] args)throws Exception {
       // this line represents System.setProperty ..path
        WebDriverManager.chromedriver().setup();     // Setup Webdriver
        WebDriver driver = new ChromeDriver();      //Create obj of Chromedirver
        driver.manage().window().maximize();   //open browser maximized
        driver.get("http://practice.cybertekschool.com/forgot_password");  //open url
        WebElement emailInputbox =driver.findElement(By.name("email"));
        WebElement submitButton = driver.findElement(By.id("form_submit"));
        emailInputbox.sendKeys("email@gmail.com");
        Thread.sleep(20000,22);
         submitButton.click();

       Thread.sleep(20000,22);

WebElement confirmationMessage = driver.findElement(By.name("confirmation message"));

String expectedMessage = "Your e-mail's sent";
String actualMessage  = confirmationMessage.getText();  //how to get text

        if(actualMessage.equals(expectedMessage)) {
            System.out.println("Test Passed");

        } else{
                System.out.println("Test failed");
            System.out.println("Expected Message"+expectedMessage);
            System.out.println("Actual message"+ actualMessage);
            }
        }

    }
