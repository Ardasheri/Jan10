package class03;

public class IfElse_09 {
    public static void main(String[] args) {

        char c='M';

        if(c=='M')
        {
            System.out.println("Male");
        }

        String name="Nat";
        // with non-primitive data types such as string we can't use == symbol
        if(name.equals("Nat")){
            System.out.println("Amazing student");
        }
        //! symbol can change true to false and false to true
        if(!name.equals("Sam"))
            System.out.println("Super amazing student");
    }
}
