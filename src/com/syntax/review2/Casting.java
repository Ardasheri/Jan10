package com.syntax.review2;

public class Casting {
    public static void main(String[] args) {

        /* Casting - convert 1 data type into another
            1. widening/implicit/automatic
            (byte -> short -> integer -> long -> float -> double)
            2. narrowing/explicit/manual
            (double -> float -> long -> integer -> short -> byte)
         */

        double d =5;

        System.out.println(d); //5.0

        //narrowing (not used as much)
        int i =(int) 5.0;
        System.out.println(i); //5

        byte b =(byte) 128;
        System.out.println(b);
    }
}
