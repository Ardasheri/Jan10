package Homeworks;

import java.util.Scanner;

public class Jan7Task4 {
    public static void main(String[] args) {
  /*
  4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”. (edited)
   */

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your birth month ");
            String month = scanner.nextLine();

            String season;
            if (month.equals("December") || month.equals("January") || month.equals("February")) {
                season = "Winter";
            } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
                season = "Spring";
                }else if (month.equals("September") || month.equals("October") || month.equals("November")) {
                    season = "Autumn";
            } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
                season = "Summer";
            } else {
                season = "Invalid month";
            }
            System.out.println("You were born in the " + season + ".");
        }
    }
