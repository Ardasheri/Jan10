package Homeworks;

import java.util.Scanner;

public class Jan7Task5 {
    public static void main(String[] args) {
        /*
        5) Write a program to find largest of three double values using if-else
        ..if and logical operators provided by a user (numbers must be distinct)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three distinct double values:");
        double value1 = scan.nextDouble();
        double value2 = scan.nextDouble();
        double value3 = scan.nextDouble();

        if (value1 > value2 && value1 > value3) {
            System.out.println("The largest value is " + value1);
        } else if (value2 > value1 && value2 > value3) {
            System.out.println("The largest value is " + value2);
        } else if (value3 > value1 && value3 > value2) {
            System.out.println("The largest value is " + value3);
        } else {
            System.out.println("The values is not distinct");
        }
    }
}