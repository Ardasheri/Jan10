package replsPractice;

import java.util.Scanner;

public class repl35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan?");
        scanner.nextBoolean();
        boolean b=true;
        if (b){
            System.out.println("What is your credit score?");
        }else if (!b) {
            System.out.println("Unknown");
        }

    }
}
