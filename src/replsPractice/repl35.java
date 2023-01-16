package replsPractice;

import java.util.Scanner;

public class repl35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you need a loan? (True/False) ");
        boolean needLoan = sc.nextBoolean();

        if (needLoan) {
            System.out.print("What is your credit score? ");
            int creditScore = sc.nextInt();
            String eligibility;
            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore <= 800) {
                eligibility = "Eligible";
            } else {
                eligibility = "Definitely eligible";
            }
            System.out.println("Your loan eligibility is: " + eligibility);
        } else {
            System.out.println("Your loan eligibility is Unknown");
        }
    }
}