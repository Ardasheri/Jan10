package HomeworkJan_17;

/*
10)Write a java program to find the second largest number in the array?
 */

public class TwoD_Array10 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 9, 2, 15, 1, 20};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second largest number in the array is: " + secondLargest);
    }
}