package HomeworkJan_17;

import java.util.Scanner;
/*
1)Using Scanner create an array of integer values.
After the array is created,
calculate the sum of all stored elements in that array.
 */
public class TwoD_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}

