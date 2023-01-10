package class03;

public class VariablesDemo_1 {
    public static void main(String[] args) {

        int age=10; //requesting the computer to create a box of type int and store a value 10 in it
        int salary; //only created a box of type int and didn't assign any value to it
        salary=120000; //updating a variable/ reassigning a value.
        System.out.println(salary);
        String name, city, country; //we can create multiple empty boxes in a single line of code
        char gender, letter;
        name="Daria"; //storing a value in the variable
        /*System.out.println(city); I have not stored anything inside the city variables,
        that is why java is confused what to print
         */
        System.out.println(name);
    }
}
