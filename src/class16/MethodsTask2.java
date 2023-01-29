package class16;

public class MethodsTask2 {
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(5); // call the method with an argument of 5
    }
}