package Homeworks;

import java.util.Scanner;

public class City {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature. Your program should
        convert Fahrenheit into celsius and print “The temperature is the city  is ”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your city.");
        String city = scan.next();
        System.out.println("Enter your city's temperature in Fahrenheit.");
        double CelsiusTemp = scan.nextDouble();
        CelsiusTemp = (CelsiusTemp-32)*5/9;
        System.out.println("Your temperature in "+city+" is "+CelsiusTemp+" degrees Celsius");
    }
}
