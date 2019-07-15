package com.cybertek.day8_testNG_intro;

import com.cybertek.utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task1 {

 //   Test Case default date
   // open website http://practice.cybertekschool.com/dropdown
 //   verify default year is current 2019
  //  verify default month is current July
   // verify default day is current 5

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void test1(){

        WebElement dropdown1 = driver.findElement(By.id("year"));

        Select dropdownSelect = new Select(dropdown1);
        String actual = dropdownSelect.getFirstSelectedOption().getText();
        String expected = "2019";
        SeleniumUtils.verifyEquals(expected, actual);
        //System.out.println("I am test1 2019");
        List<WebElement> options = dropdownSelect.getOptions();
        for(WebElement option: options){
            System.out.println(option.getText());
        }
    }


    @Test
    public void test2() {
        WebElement dropdown1 = driver.findElement(By.id("month"));

        Select dropdownSelect = new Select(dropdown1);
        String actual = dropdownSelect.getFirstSelectedOption().getText();
        String expected = "july";
        SeleniumUtils.verifyEquals(expected, actual);
        //System.out.println("I am test1 2019");
        List<WebElement> options = dropdownSelect.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

     //   @Test
     //   public void test3 () {
            WebElement dropdown2 = driver.findElement(By.id("day"));

            Select dropdownSelect2 = new Select(dropdown2);
            String actual1 = dropdownSelect.getFirstSelectedOption().getText();
            String expected1 = "5";
            SeleniumUtils.verifyEquals(expected, actual);
            //System.out.println("I am test1 2019");
            List<WebElement> options1 = dropdownSelect.getOptions();
            for (WebElement option1 : options) {
              //  System.out.println(options1.getText());
            }
        }

      //  @AfterMethod
        //        public void test4(){
           // driver.quit();
        }

  //  }

