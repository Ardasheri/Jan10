package class04;

public class IfElseConditions2 {
    public static void main(String[] args) {

        boolean rain=false;

        if(rain){
            System.out.println("Let's take an umbrella "); //plan a
        }else{
            System.out.println("Let's take a hat"); //plan b
        }
        //create a boolean variable, call it break if it contains true, print let's take the break
        //otherwise it should print lets continue class
        boolean breakTime=true;
        if(breakTime){
            System.out.println("let's take the break");
        }else{
            System.out.println("let's continue class");
        }
    }
}
