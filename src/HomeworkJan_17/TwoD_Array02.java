package HomeworkJan_17;

import java.util.Scanner;

/*
2)Using Scanner create an array of countries.
When an array is created, retrieve all values
from it and while retrieving those values print
capital for each country. (use 2 different loops).
 */
public class TwoD_Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] countries = new String[5];

        // Create an array of countries
        System.out.println("Enter 5 countries:");
        for (int i = 0; i < countries.length; i++) {
            countries[i] = scanner.nextLine();
        }

        // Retrieve values from the array and print capital for each country (using a for loop)
        System.out.println("Capitals (using a for loop):");
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("India")) {
                System.out.println("New Delhi");
            }
            else if (countries[i].equals("USA")) {
                System.out.println("Washington D.C.");
            }
            else if (countries[i].equals("UK")) {
                System.out.println("London");
            }
            else if (countries[i].equals("France")) {
                System.out.println("Paris");
            }
            else if (countries[i].equals("China")) {
                System.out.println("Beijing");
            }
        }

        // Retrieve values from the array and print capital for each country (using a for-each loop)
        System.out.println("Capitals (using a for-each loop):");
        for (String country : countries) {
            if (country.equals("India")) {
                System.out.println("New Delhi");
            }
            else if (country.equals("USA")) {
                System.out.println("Washington D.C.");
            }
            else if (country.equals("UK")) {
                System.out.println("London");
            }
            else if (country.equals("France")) {
                System.out.println("Paris");
            }
            else if (country.equals("China")) {
                System.out.println("Beijing");
            }
        }
    }
}

