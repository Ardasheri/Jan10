package com.syntax.review2;

public class IfElseIF {
    public static void main(String[] args) {

        /* when we have multiple conditions to test

        if (boolean condition){
                code A;
        }else if (boolean condition) {
                code B;
        }else if (boolean condition) {
                code C;
        }

         */

        /* Check homework
            if you completed more than 25-> great job
            if you completed more than 20-> good job
            if you completed more than 10-> ok job
            if you completed more than 5-> not good job
        */
        int repls = 30;
        if (repls > 5) {
            System.out.println("Not good job");
        } else if (repls > 10) {
            System.out.println("OK job");
        } else if (repls > 20) {
            System.out.println("Good job");
        } else if (repls > 30) {
            System.out.println("Great job");
        }
        System.out.println("___________________________________________");

        String browser = "opera";
        if(browser.equals("chrome")){
            System.out.println("Test cases executed on chrome browser");
        }else if(browser.equals("safari")){
            System.out.println("Test cases executed on safari browser");
        }else if(browser.equals("firefox")){
            System.out.println("Test cases executed on firefox browser");
        }else{ //when none of the conditions are true, code executes else block
            System.out.println("Some other browser");
        }
    }
}
