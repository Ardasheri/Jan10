package replsPractice;

import java.util.Scanner;

public class Replit_23 {
    public static void main(String[] args) {

        /*
        Create a program that will ask a user to input boolean value "Input the boolean value"
        If the input is true or false, then the output should look like below:
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the boolean value");
        scan.nextBoolean();
        boolean input = true;
        if(input){
            System.out.println("The value is true");

        }else{
            System.out.println("The value is false");
        }
        }
    }

