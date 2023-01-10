package Homeworks;

public class Mortgage {
    public static void main(String[] args) {
        /*
        Create a Java program and store values of mortgage rate and mortgage price. First, program should check
        if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides
        to buy a house, if price of the house is larger than 200000 then user will take a loan, otherwise user will
        pay cash.
         */
        double mortgageRate = 5.0;
        int mortgagePrice = 300000;
        if(mortgageRate>4.5){
            System.out.println("Client will not buy a house.");
        }else {
            System.out.println("Client will consider buying.");
        }if(mortgagePrice>200000){
            System.out.println("Client will take a loan.");
        }else{
            System.out.println("Client will pay cash.");
        }
    }
}
