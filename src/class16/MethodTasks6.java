package class16;

public class MethodTasks6 {
    public static class Student {
        public static char getGrade(int score) {
            if (score > 90) {
                return 'A';
            } else if (score > 80) {
                return 'B';
            } else if (score > 70) {
                return 'C';
            } else if (score > 50) {
                return 'D';
            } else {
                return 'F';
            }
        }
    }
    public static void main(String[] args) {
        Student obj= new Student();
        System.out.println(obj.getGrade(89)); // will print 'B'
    }
}
