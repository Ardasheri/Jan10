package com.syntax.review1;

public class DataTypes {
    public static void main(String[] args) {

        /* Data types in Java:
        1) Primitive = 8 total
         byte, short, float, integer,, long, double, boolean, char
         numeric:
            whole numbers: byte, short, int, long
            decimal numbers: float, double

            boolean: true/false
            char: symbol

        2) Non-primitive
         */

        //dataType  nameOfTheVariable = value;
        //data types for whole numbers

        byte bag=10;
        short boy=10;
        int  girl=16; //most used
        long john=120;

        //data types for decimal values
        float fatty= 6.2f;
        double trouble=222;

        //data type to represent single character

        char money='$';
        char gender='m';

        //to represent yes or no
        boolean needBreak=true;
        boolean understandingJava=true;


        System.out.println(bag); //printing value inside variable
        System.out.println("bag"); //printing the String text

        //create a variable and store value into it
        boolean hungry=false;
        System.out.println(hungry);
    }
}
