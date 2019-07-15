package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.WebDriverException;
import static java.lang.System.*;

import java.util.List;


public class SeleniumUtils {


        /**
         *
         * @param expectedResult
         * @param actualResult
         * Verifies if two strings are equals.
         */
        public static void verifyEquals(String expectedResult, String actualResult){
            if(expectedResult.equals(actualResult)){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
                System.out.println("Expected result: "+expectedResult);
                System.out.println("Actual result: "+actualResult);
            }
        }

        /**
         *  This method will put on pause execution
         * @param seconds
         */
        public static void waitPlease(int seconds){
            try {
                Thread.sleep(seconds * 1000 );
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        public static void openPage(String page, WebDriver driver){
            //we will find all examples on the home page
            List<WebElement> listOfExamples = driver.findElements(By.tagName("a"));
            for(WebElement example: listOfExamples){
                if(example.getText().contains(page)){
                    example.click();
                    break;
                }
            }
        }

        public static void verifyIsDisplayed(WebElement element){
            if(element.isDisplayed()){
                System.out.println("PASSED");
                System.out.println(element.getText()+": is visible");
            }else{
                System.out.println("FAILED");
                System.out.println(element.getText()+": is not visible!");
            }
        }

        //this methid will recover in case of exception during unsuccessful click,
        // and will try to click on the element agin
        public static void clickWithWait(WebDriver driver, By by, int attempt)throws Exception{
            int counter=0;
            //click on element as many as you specified in attempts parameter
            while(counter <attempt)
                try{
                    //selenium must look for that element
                    driver.findElement(by).click();
                    //if click is successful - then break
                }catch(WebDriverException e){
                    //if click failed
                    //print exception
                    System.out.println(e);
                    //wait for one second, and try to click again
                  Thread.sleep(2000,2);
                    System.out.println("Attempt: " + ++counter);
               Thread.sleep(2000,2);
                }
        }

    }


