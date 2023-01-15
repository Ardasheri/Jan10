package Homeworks;

import java.util.Scanner;

public class Jan14HomeWorkTask2 {
    /*
   2) Create a program that will be asking user to apply for a credit card 10 times.
   As soon you get an “yes” from a user program should stop asking.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println("Would you like to apply for a credit card? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for your application!");
                break;
            }
            i++;
        }}}