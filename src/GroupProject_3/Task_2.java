package GroupProject_3;

public class Task_2 {
    abstract class Marks {
        int subject1;
        int subject2;
        int subject3;
        int subject4;
        abstract double getPercentage();
    }

    class A extends Marks {
        public A(int s1, int s2, int s3) {
            subject1 = s1;
            subject2 = s2;
            subject3 = s3;
        }

        public double getPercentage() {
            return (subject1 + subject2 + subject3) / 3.0;
        }
    }

    class B extends Marks {
        public B(int s1, int s2, int s3, int s4) {
            subject1 = s1;
            subject2 = s2;
            subject3 = s3;
            subject4 = s4;
        }

        public double getPercentage() {
            return (subject1 + subject2 + subject3 + subject4) / 4.0;
        }
    }

    public class Test {
        public static void main(String[] args) {
            A a = new A(60, 70, 80);
            System.out.println("Percentage of Student A: " + a.getPercentage());

            B b = new B(70, 80, 90, 85);
            System.out.println("Percentage of Student B: " + b.getPercentage());
        }
    }
}
