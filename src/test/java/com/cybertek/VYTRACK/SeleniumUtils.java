package com.cybertek.VYTRACK;

public class SeleniumUtils {
    public static void verifyEquals(String expectedResult,String actualResult){

        if(expectedResult.equals(actualResult)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
            System.out.println("Expected result:"+expectedResult);
            System.out.println("Actual result"+actualResult);
        }
    }
}
