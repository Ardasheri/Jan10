package HomeworkJan_17;

/*
6)Write a program to swap 2 numbers without a temporary variable?
 */

public class TwoD_Array06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " b = " + b);
    }
}