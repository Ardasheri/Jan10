package Homeworks;

import java.util.Scanner;

public class Jan7Task2 {
    public static void main(String[] args) {
        /*
        2) Write a program that will print whether it is a weekend or weekday.
        If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a weekend”,
        any other day → output “Invalid day”
         */
        int day;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a weekday number 0 to 7 ");
        day=scanner.nextInt();

        if(day==1 || day==2 ||day==3 ||day==4||day==5){
            System.out.println("It is a weekday");

        }else if (day==6 || day==7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
     }
}
