package Homeworks;

import java.util.Scanner;

public class Jan7Task7 {
   public static void main(String[] args) {

      /* 7) Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.
        Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.
*/
                 Scanner sc = new Scanner(System.in);
           System.out.println("Enter your country: Tanzania, UK, USA, Kyrgyzstan or Iran");
           String country = sc.nextLine();

           if (country.equalsIgnoreCase("Tanzania")) {

               System.out.println("You have selected Swahili");

               System.out.println("Umechagua Kiswahili ");
               int not = sc.nextInt();

               if  (not >= 90) {System.out.println("Alama yako ni "+not+". Daraja lako ni daraja A");}
               else if(not >=70 && not < 90 ) {System.out.println("Alama yako ni "+not+". Daraja lako ni daraja B");}
               else if (not >= 50 && not <= 70) {System.out.println("Alama yako ni "+not+". Daraja lako ni daraja C");}
               else {System.out.println("Alama yako ni "+not+". Haikubaliki");}
           }

           if (country.equalsIgnoreCase("UK") || country.equalsIgnoreCase("USA")) {

               System.out.println("You have select English");

               System.out.println("Enter your grade");
               int not = sc.nextInt();

               if  (not >=90) {System.out.println("Your Score is "+not+". Your grade is grade A");}
               else if(not >=70 && not < 90 ) {System.out.println("Your Score is "+not+". Your grade is grade B");}
               else if (not >= 50 && not <= 70) {System.out.println("Your Score is "+not+". Your grade is grade C");}
               else if (not >= 0 && not <= 50){System.out.println("Your Score is "+not+". Your grade is grade D");}
               else {System.out.println("Your Score is "+not+". It is not acceptable");}
           }

           if (country.equalsIgnoreCase("Kyrgyzstan")) {

               System.out.println("You have select Kyrgyz");

               System.out.println("классыңызга киргиле");
               int not = sc.nextInt();

               if  (not >= 90) {System.out.println("сиздин балл болуп саналат "+not+" сиздин класс — А");}
               else if(not >=70 && not < 90 ) {System.out.println("сиздин балл болуп саналат "+not+" сиздин класс — B");}
               else if (not >= 50 && not <= 70) {System.out.println("сиздин балл болуп саналат "+not+" сиздин класс — C है");}
               else if (not >= 0 && not <= 50){System.out.println("сиздин балл болуп саналат "+not+" है। сиздин класс — D है");}
               else {System.out.println("сиздин балл болуп саналат "+not+". бул кабыл алынбайт");}
           }

           if (country.equalsIgnoreCase("Iran")) {

               System.out.println("You have selected Farsi");

               System.out.println("درجه خود را وارد کنید");
               int not = sc.nextInt();

               if  (not >=90) {System.out.println("ستاسو درجه A درجه ده"+not+".ستاسو نمره ده");}
               else if(not >=70 && not < 90 ) {System.out.println("ستاسو درجه د B درجه ده "+not+".ستاسو نمره ده");}
               else if (not >= 50 && not <= 70) {System.out.println("ستاسو درجه د C درجه ده "+not+".ستاسو نمره ده");}
               else if (not >= 0 && not <= 50){System.out.println("ستاسو درجه د D درجه ده "+not+".ستاسو نمره ده");}
               else {System.out.println("تاسو رد شوي یاست "+not+".ستاسو نمره ده");}

           }
       }
   }