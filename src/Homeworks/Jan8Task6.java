package Homeworks;

public class Jan8Task6 {
 //Print odd numbers between 20 and 50 (2 ways)
    public static void main(String[] args) {
int num=20;
while (num<=50){
    if(num%2==1){
        System.out.println(num+ " ");
    }
    num++;
}
int num1=21;
while (num1<=50){
    System.out.println(num1+ " ");
    num1+=2;
}
    }
}
