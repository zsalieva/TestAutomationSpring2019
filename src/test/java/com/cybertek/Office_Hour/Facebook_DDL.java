package com.cybertek.Office_Hour;
import java. util.List;
//import com.cybertek.Utilities.SeleniumUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DDL {



        public static void main(String[] args)throws Exception {

            // test1();
            test2();

        }

        public static void test1()throws Exception{
            // becasue we have maven
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            Thread.sleep(3000,3);


            Select month = new Select(driver.findElement(By.xpath(".//select[@aria-label='Month']")));

            month.selectByIndex(5);

            Thread.sleep(3000,3);

            month.selectByValue("11");

            Thread.sleep(3000,3);

            month.selectByVisibleText("Sep");


            List <WebElement >list1  =  month.getOptions();

            WebElement september = list1.get(9);

            System.out.println(september.isSelected());



        }



        public static void test2()throws Exception{
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
          Thread.sleep(3000,3);

            WebElement yeardb = driver.findElement(By.xpath("//select[@name='birthday_year']"));
            Select year = new Select (yeardb);

            year .selectByVisibleText("1909");



            List <WebElement> list = year.getOptions();

            WebElement Y1909 =  null ;

            for( WebElement each : list) {
                if (each.getText().equals("1909"))
                    Y1909 = each;
            }
            System.out.println(Y1909.isSelected());

        }
    }

