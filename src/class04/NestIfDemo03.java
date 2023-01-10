package class04;

public class NestIfDemo03 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=12000;
        if(studyHard){
            System.out.println("We get the job");

            if(salary>100000){
                System.out.println("Let's buy mercedes");
            }else{
                System.out.println("Let's buy a honda");
            }


        }else{
            System.out.println("It might take a little longer to get jobs");
        }

    }
}
