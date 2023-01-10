package Homeworks;

import java.util.Scanner;

public class Jan7Task8 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the calculator" +
                    "!");

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operation (+, -, *, /): ");

            char operation = scanner.next().charAt(0);

            double result = 0;

            if (operation == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operation == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operation == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operation == '/') {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("invalid input");
            }

            System.out.println("Goodbye!");
        }
    }
