package class02;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="Ardasher";
        String lastName="Abdurazakov";

        System.out.println(firstName+" "+lastName+" "+"The Great King");
    /*
    java executes code from top to bottom but if we have multiple operations on the same line it executes them from
    left to right
    */
        System.out.println("First name = "+firstName);
        System.out.println("Last name = "+lastName);

        System.out.println("10 "+"10");
        String space=" ";
        System.out.println(firstName+space+lastName);

        System.out.println(firstName+10);
    }
}
