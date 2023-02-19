package GroupProject_3;

public class Task_1 {
    public interface Shape {
        public double calculateArea();
        public double calculatePerimiter();
    }

    public class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculatePerimiter() {
            return 2 * Math.PI * radius;
        }
    }

    public class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        public double calculateArea() {
            return side * side;
        }

        public double calculatePerimiter() {
            return 4 * side;
        }
    }

    public class Test {
        public static void main(String[] args) {
            Shape c = new Circle(5);
            System.out.println("Area of circle: " + c.calculateArea());
            System.out.println("Perimiter of circle: " + c.calculatePerimiter());

            Shape s = new Square(10);
            System.out.println("Area of square: " + s.calculateArea());
            System.out.println("Perimiter of square: " + s.calculatePerimiter());
        }
    }

    }
