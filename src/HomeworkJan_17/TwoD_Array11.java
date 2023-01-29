package HomeworkJan_17;

/*
11)Write a program to print out duplicate elements from an Array of Strings?
 */

public class TwoD_Array11 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple", "banana", "kiwi", "orange"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate element: " + arr[j]);
                }
            }
        }
    }
}