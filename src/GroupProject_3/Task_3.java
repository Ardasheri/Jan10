package GroupProject_3;

public class Task_3 {
    public class Car {
        protected double carPrice;
        protected String color;

        public Car(double carPrice, String color) {
            this.carPrice = carPrice;
            this.color = color;
        }

        public double calculateSalePrice() {
            return carPrice;
        }
    }

    public class Truck extends Car {
        protected double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        public double calculateSalePrice() {
            if (weight > 2000) {
                return carPrice * 0.9;
            } else {
                return carPrice * 0.8;
            }
        }
    }

    public class Sedan extends Car {
        protected double length;

        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        public double calculateSalePrice() {
            if (length > 20) {
                return carPrice * 0.95;
            } else {
                return carPrice * 0.9;
            }
        }
    }

    public class Test {
        public

    }
