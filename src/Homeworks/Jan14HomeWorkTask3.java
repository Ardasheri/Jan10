package Homeworks;

import java.util.Scanner;

public class Jan14HomeWorkTask3 {
    /*
3) Write a program that reads a range of integers (start and end point),
provided by a user and then from that range prints the sum of the even and odd integers.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end, evenSum = 0, oddSum = 0;

        System.out.println("Enter the start of the range: ");
        start = scanner.nextInt();
        System.out.println("Enter the end of the range: ");
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers in the range: " + evenSum);
        System.out.println("Sum of odd numbers in the range: " + oddSum);
    }}