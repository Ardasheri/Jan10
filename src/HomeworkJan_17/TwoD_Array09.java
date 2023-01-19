package HomeworkJan_17;

/*
9)Maximum and minimum number in the array?
 */

public class TwoD_Array09 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 2, 15, 1, 20};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number in the array is: " + max);
        System.out.println("Minimum number in the array is: " + min);
    }
}