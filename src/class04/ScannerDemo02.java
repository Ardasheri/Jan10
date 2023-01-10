package class04;

import java.util.Scanner;

public class ScannerDemo02 {
    public static void main(String[] args) {

        //Below line helps us get the input from the keyboard
        Scanner scan=new Scanner(System.in);
        System.out.println("Type your age");
        int age=scan.nextInt(); //nextLine is used when we have to take numbers from the keyboard
        System.out.println("Your age is "+age+" years old.");



    }
}
