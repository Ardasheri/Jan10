package HomeworkJan_17;

/*
3) Create a 2D array of integer values. Print the sum of all numbers.
 */
public class TwoD_Array03 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        // Print the sum of all numbers
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}