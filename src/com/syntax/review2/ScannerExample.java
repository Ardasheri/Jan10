package com.syntax.review2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int i=10;
   //non-prim, variable = scanner
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Tell me how many wives you want?");
       int wives =keyboard.nextInt(); //to capture int values

       System.out.println("Are you happy?");
       boolean happy = keyboard.nextBoolean(); //to capture boolean values

       System.out.println("What is your wife's names?");
       String names = keyboard.next(); //to capture String until space

        System.out.println(wives);
        System.out.println(happy);
        System.out.println(names);
        System.out.println("You are a happy man with "+names);
    }
}
