package Homework_Jan15;

public class Jan15Task5 {
    /*
    5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements in the array: " + sum);
        }
    }

