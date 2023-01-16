package Homework_Jan15;

public class Jan15Task6 {
    /*
   6)Create an array of countries.
   While retrieving all values from an array print
   capital for each country choose any five countries.
     */
    public static void main(String[] args) {
        String[] countries = {"India", "USA", "France", "Germany", "Russia"};
        String[] capitals = {"New Delhi", "Washington D.C.", "Paris", "Berlin", "Moscow"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
        }

        }
    }

