package Homeworks;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        /*
        You are DMV representative, you need to ask customer their age. If they are 18 and older you will
        issue a driver licence to them, otherwise you will offer them to get a learners permit.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age?");
       int age=scan.nextInt();
        if(age>=18){
            System.out.println("Issue driver license.");
        }else{
            System.out.println("Issue learner's permit.");
        }
    }
}
