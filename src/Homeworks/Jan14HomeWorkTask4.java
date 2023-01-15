package Homeworks;

import java.util.Scanner;

public class Jan14HomeWorkTask4 {
    /*
    4)  Write a program to ask a user to enter item they want to buy and the price of that item.
    Every time user enters money accumulate the amount and tell the user how much is left to pay off.
    If user give more money program should return a change. Whenever a user done with payments program
    should say "Thank you for shopping!"
     */
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String item;
    double price, amountPaid = 0, change;

System.out.println("Enter the name of the item you want to buy: ");
    item = scanner.nextLine();
System.out.println("Enter the price of the item: ");
    price = scanner.nextDouble();

while (amountPaid < price) {
        System.out.println("Enter the amount you want to pay: ");
        double payment = scanner.nextDouble();
        amountPaid += payment;
        if (amountPaid < price) {
            double remaining = price - amountPaid;
            System.out.println("Amount remaining to be paid: " + remaining);
        } else {
            change = amountPaid - price;
            System.out.println("Your change is: " + change);
            break;
        }
    }
System.out.println("Thank you for shopping!");
    }}