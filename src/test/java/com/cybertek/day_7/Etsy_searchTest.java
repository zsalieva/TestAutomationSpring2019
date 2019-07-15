package com.cybertek.day_7;

import com.cybertek.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.List;

public class Etsy_searchTest {


        static WebDriver driver = BrowserFactory.getDriver("chrome");

        public static void main(String[] args) throws Exception{
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.ebay.com/");
            driver.findElement(By.id("gh-ac")).sendKeys("wooden spoon", Keys.ENTER);

            driver.findElement(By.id("gh-btn")).click();
            String results1 = driver.findElement(By.className("srp-controls__count-heading")).getText();
          //  List<WebElement> woodenSpoon = driver.findElements(By.cssSelector("ul a"));
            System.out.println(results1);
            //Navigates to All option
            driver.findElement(By.xpath("//span[.='Settings']")).click();

            //driver.navigate().to("https://www.ebay.com/sch/i.html?_from=R40&amp;_nkw=wooden+spoon&amp;_oac=1");
            Thread.sleep(2000,3);
            String results2 = driver.findElement(By.className("srp-controls__count-heading")).getText();
            System.out.println(results2);

            // Cheking the results1 and result2
            String expectedResult = results1;
            String actualResult = results2;

            if(!results2.equals(results1)){
                System.out.println("Bigger Passed");}
                else{
                System.out.println("not Bigger Failed");

                }
            Thread.sleep(2000,3);
            driver.navigate().back();
            WebElement inputBox = driver.findElement(By.id("gh-ac"));
            String textInsideInputBox = inputBox.getAttribute("wooden spoon");

       // Check whether input field is blank
            if(textInsideInputBox.isEmpty())
            {
                System.out.println("Input field is empty");
            }
            else{
                System.out.println("Not empty : wooden spoon");
            }

            }
        }



