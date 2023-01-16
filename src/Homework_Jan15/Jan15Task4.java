package Homework_Jan15;

public class Jan15Task4 {
    /*
    4) Create an array that can store names of cars and store 6 elements into it.
    Print all values from the array.
     */
    public static void main(String[] args) {
        String[] cars = new String[6];
        cars[0] = "Toyota";
        cars[1] = "Honda";
        cars[2] = "Ford";
        cars[3] = "BMW";
        cars[4] = "Mercedes";
        cars[5] = "Audi";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
