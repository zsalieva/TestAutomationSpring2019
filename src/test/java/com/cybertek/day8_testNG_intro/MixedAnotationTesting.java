package com.cybertek.day8_testNG_intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MixedAnotationTesting {


    @BeforeMethod
    public void setup(){
        System.out.println("Before Method");
    }

    @Test
    public void test1(){
        System.out.println("I am test1");
    }


    @Test
    public void test2(){
        System.out.println("I am test2");
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("After method");
    }

    @AfterClass
    public  void  afterClass(){
        System.out.println("After Class");
    }

}
