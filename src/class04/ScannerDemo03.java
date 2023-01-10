package class04;

import java.util.Scanner;

public class ScannerDemo03 {
    public static void main(String[] args) {

        //Below line helps us get the input from the keyboard
        Scanner scan=new Scanner(System.in);
        System.out.println("You ready?");
        boolean ready=scan.nextBoolean(); //nextBoolean is used when we have to take input from the keyboard
        System.out.println("You're ready "+ready);



    }
}
