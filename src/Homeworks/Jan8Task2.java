package Homeworks;

public class Jan8Task2 {
    /*
    Create a boolean variable workDay and assign true create int variable day and assign it to 1
As long as it is workDay print “I need a day off” and increase day.
Once day is 6 print “I do not need a day off any more”

     */
    public static void main(String[] args) {

        boolean workDay=true;
        int day=1;
        while (workDay) {
            System.out.println("I need a day off");
            if (day == 6) {
                workDay = false;
                System.out.println("I do not need a day off any more");
            }
            day++;
        }
    }
}
