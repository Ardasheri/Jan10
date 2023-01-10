package Homeworks;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask if user has a credit card or not. If you user does not have a
        credit card then offer them. If they do have one ask what is balance on the card? If balance of the
        card is larger than 1000, tell them to pay off immediately, otherwise you can tell them that they can
        spend more.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = scan.next();
        if(card.equals("No")){
            System.out.println("Would you like to apply for a credit card?");
        }else{
            System.out.println("What is your current balance?");
        }
        int balance = scan.nextInt();
        if (balance > 1000) {
            System.out.println("Pay off your balance!");
        }else {
            System.out.println("Use your available balance.");
        }
    }
}
