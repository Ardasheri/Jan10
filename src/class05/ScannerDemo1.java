package class05;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        /*
        Scanner -> name of class
        scan -> a variable such as a primitive variable
        = -> assignment operator
        System.in -> tells the comp that we want to read the data from the keyboard
         */
        /* System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight= scanner.nextDouble();
        System.out.println("Your weight is "+ weight);
        System.out.println("Are you hungry?");
        boolean hungry= scanner.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender= scanner.next().charAt(0);
        System.out.println("Your gender is "+gender);
        */
        System.out.println("Please enter your name");
        String name= scanner.next();
        System.out.println("Your full name is "+ name);

        scanner.nextLine(); //Trick to make nextLine method work after we have used any other method from
                            //Scanner class
        System.out.println("Please enter your full name");
        String fullName= scanner.nextLine();
        System.out.println("Your full name is "+fullName);
        scanner.close(); //Good practice
    }
}
