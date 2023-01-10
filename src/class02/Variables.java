package class02;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the computer's memory.
        We are calling it box1 if we need the info that we are storing inside the box
        we can simply say to the comp to give us the contents of box1
        int=> what type of data we want to store
        box1=>the name of the box
        =  sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
         */
        int box1=10;
        //if we are printing something from a box we don't need ""
        System.out.println(box1); // bring the contents of box1 and print them on the console
        /* To store whole numbers we have 4 different types of boxes.
        //for example numbers like 10 20 300 10000 330000
        1) byte 2) short 3) int 4) long
        */
        byte box2=127;
        byte box3=-128;
        short box4=128;
        short box5=-3256;
        int biggerBox=12345678; //most common type of box
        long maxBox=123362548246l;

        int myBox=100000;
        System.out.println(myBox);


    }
    }

