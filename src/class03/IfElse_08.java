package class03;

public class IfElse_08 {
    public static void main(String[] args) {

        int age=17;
        System.out.println(age<18);
        if(age<18)
        {
            System.out.println("Time to play");
        }

        /*
        if conditions work based on boolean true or false if we have a true inside the if () it executes
        all the code inside {} if it is false, it does not execute any code inside  {}
         */
        boolean inSyntaxBootCamp=false;

        if(inSyntaxBootCamp)
        {
            System.out.println("Time to start practicing java");
        }
    }
}
