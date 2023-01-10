package class04;

public class NestIf {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood = true;

        if (money > 700) {
            if (mood) {
                System.out.println("Lets go shopping");
            }else
                System.out.println("save");
        }

    }
}
