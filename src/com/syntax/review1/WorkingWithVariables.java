package com.syntax.review1;

public class WorkingWithVariables {
    public static void main(String[] args) {

        //create a variable and store value into it
        //declared a variable and initialized it

        //declared a variable
        int nut=1;


        int nuts=2; //declared a variable and assigned value to it

        nuts=3; //reassigned the value;


        System.out.println(nuts);

        boolean hungry=false;
        hungry=true;

        String myString="Hello";
        String name="Arash";

        String address="Adderral St";

        System.out.println(myString+" "+name);

        int age=29;

        System.out.println(name+" is "+age+" years young");
        /*
        if we want to attach string to anything:

        string to another string
        string to int
        string to boolean
        string to char

        we use +
         */

        //when we have 2 numeric values = Acts as addition
        System.out.println(nuts+nut);

        String month="December";
        int day=15;

        //15 December
        System.out.println(day+month);

        char date='1';
        System.out.println(date+month);//63

        System.out.println(date+day);
    }
}
