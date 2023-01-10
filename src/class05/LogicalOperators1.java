package class05;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);

        boolean boughtChoc=false; // change it to true or false
        boolean boughtFlowers=false; //change it to false or true
        if(boughtChoc||boughtFlowers){
            System.out.println("I am happy");
        }else{
            System.out.println("I am Sad");
        }

        boolean wifi=true;// change it to false
        boolean fiveG=true; // change it to false

        if(wifi||fiveG){
            System.out.println("You are good for browsing the internet.");
        }else{
            System.out.println("Either connect to wifi or to 5G.");
        }
    }
}
