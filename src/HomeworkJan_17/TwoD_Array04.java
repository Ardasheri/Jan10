package HomeworkJan_17;

/*
4) Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print
 */

public class TwoD_Array04 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] numbers = new int[rows][columns];

        //Initializing the array with values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = (i*columns + j)*2;
            }
        }

        // Identifying and printing the even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Identifying and printing the odd numbers
        System.out.println("Odd numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (numbers[i][j] % 2 != 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}