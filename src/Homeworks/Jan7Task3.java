package Homeworks;

import java.util.Scanner;

public class Jan7Task3 {
    public static void main(String[] args) {
       /*
       3) Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
                */
        int averageScore;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your quiz Score?");
        int quiz = scanner.nextInt();
        System.out.println("Please enter mid term score:");
        int midTerm = scanner.nextInt();
        System.out.println("Please enter final score");
        int finalScore = scanner.nextInt();
        averageScore = (quiz+midTerm+finalScore)/3;

        if  (averageScore >90) {

            System.out.println("Your Score is "+averageScore+". Which is a grade A");
        }

        else if(averageScore >=70 && averageScore < 90 )
            System.out.println("Your Score is "+averageScore+". Which is a grade B");

        else if (averageScore >= 50 && averageScore <= 70) {

            System.out.println("Your Score is "+averageScore+". Which is a grade C");
        }

        else {
            System.out.println("Your Score is "+averageScore+". Which is a grade F");
        }
    }
}