package class04;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {

        //Below line helps us get the input from the keyboard
        Scanner scan=new Scanner(System.in);
        System.out.println("Type your name");
        String name=scan.nextLine(); //nextLine is used when we have to take sentences from the keyboard
        System.out.println("Your name is "+name);



    }
}
