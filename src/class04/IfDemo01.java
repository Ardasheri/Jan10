package class04;

public class IfDemo01 {
    public static void main(String[] args) {

        int money = 150000;

        if (money > 1000) {
            System.out.println("Lets buy iPhone");
        }
        if (money > 2000) {
            System.out.println("Lets buy Macbook");

        }
        boolean mothersday = true;
        if (mothersday) {
            System.out.println("Happy mother's day");
        }
        String name = "Sardar";
        //equals method is only used for non-primitives
        if (name.equals("Sardar")) {
            System.out.println("I love football");
        }
    }
}
