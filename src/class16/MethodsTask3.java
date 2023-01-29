package class16;

public class MethodsTask3 {
    public static void checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindrome("civic");
        checkPalindrome("level");
    }
}