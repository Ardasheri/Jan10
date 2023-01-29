package class16;

public class MethodsTask1 {
//1) Create a method that will take 2 parameters
// as a numbers and prints which number is larger.
    public static void compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
    }
    public static void main(String[] args) {
        compareNumbers(5,10);
    }
}
