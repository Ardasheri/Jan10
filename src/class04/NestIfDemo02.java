package class04;

public class NestIfDemo02 {
    public static void main(String[] args) {

        int money = 100;
        String day = "Sunday";
        boolean mood = false;

        if (money > 700) {
            if (mood) {
                System.out.println("Lets go shopping");
            }
        } else {
            System.out.println("Save money first");
        }
    }
}

