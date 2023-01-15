package Homeworks;

public class Jan14HomeWorkTask1 {
    /*
    1) Print numbers from 1 to 50 except those that are divisible by 3
     */
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }}}
