package Homeworks;

import java.util.Scanner;

public class Jan7Task6 {
    public static void main(String[] args) {
        /*
        6)Write a program to find the largest number among three numbers using nested
        if provided by a user (numbers must be distinct)
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int largestNumber;

        if (number1 > number2) {
            if (number1 > number3) {
                largestNumber = number1;
                System.out.println("The largest value is " + largestNumber);
            }
        }

        if (number2 > number1) {
            if (number2 > number3) {
                largestNumber = number2;
                System.out.println("The largest value is " + largestNumber);
            }
        }
        if (number3 > number1) {
            if (number3 > number2) {
                largestNumber = number3;
                System.out.println("The largest value is " + largestNumber);
            }
        }
    }
}