package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        /* nested if is 1 statement inside another if statement

           when we have 1 condition that depends on another

         */

        boolean vaccine = true;
        int dose = 6;
        if(vaccine){
            System.out.println("How many doses you have?");
            //inner if  always depends on outer if
            if(dose==1){
                System.out.println("You need a 2nd shot");

            }else{
                System.out.println("You are fully vaccinated");
            }
        }else{
            System.out.println("I don't have a vaccine :(");
        }
    }
}
