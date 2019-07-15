package com.cybertek.day8_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaTestNGDemo {

    @Test
    public void test1() {
        String a = "A";
        String b = "A";
        Assert.assertEquals(a, b);
    }

    @Test
    public void test2() {
        String str1 = "apple";
        String str2 = "orange";
        Assert.assertEquals(str1, str2);
    }

    @Test
    public void test3() {
        String str1 = "ADDfe";
        String str2 = "DDady";
        Assert.assertTrue(str1.contains(str2));


       // @Test
       // public void test4(){
       //     String str11 = "AD";
       //     String str12 = "Dady";
       //     Assert.assertFalse(false);
      //  }
    }
}