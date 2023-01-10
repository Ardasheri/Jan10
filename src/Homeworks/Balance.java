package Homeworks;

import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        /* Write a program to ask user to enter numbers of worked years and annual salary. If user worked for more or
        equals to 5 years than user is eligible for the bonus, otherwise he is not. Once user is eligible and salary is
        larger than 50000 than bonus = 5000, otherwise bonus=3000.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of worked years");
        int years = scan.nextInt();
        System.out.println("Enter your annual salary");
        int salary = scan.nextInt();
        if(years>5){
            System.out.println("You're eligible for a bonus");
        }else{
            System.out.println("Not eligible yet");
        }boolean eligible = true;
        if(eligible && salary>50000){
            System.out.println("You get a bonus of 5000");
        }else{
            System.out.println("You get 3000 bonus");
        }
    }
}
