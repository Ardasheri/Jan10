package HomeworkJan_17;

/*
5)Create a 2D array of integers. Develop a program which will
calculate the sum of  even and odd numbers for that array.
 */

public class TwoD_Array05 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] numbers = new int[rows][columns];
        int evenSum = 0;
        int oddSum = 0;

        //Initializing the array with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = (i*columns + j)*2;
            }
        }

        // Calculating the sum of even numbers
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}