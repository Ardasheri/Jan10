package class16;

public class MethodTask4 {
    //4)Create a method that will say Hello in different language
    // based on the country that will passed when method is executed
        public static void sayHello(String country) {
            switch (country.toLowerCase()) {
                case "france":
                    System.out.println("Bonjour");
                    break;
                case "germany":
                    System.out.println("Hallo");
                    break;
                case "italy":
                    System.out.println("Ciao");
                    break;
                case "spain":
                    System.out.println("Hola");
                    break;
                case "japan":
                    System.out.println("こんにちは");
                    break;
                default:
                    System.out.println("Hello");
                    break;
            }
        }
        public static void main(String[] args) {
            sayHello("France"); // call the method with an argument of "France"
            sayHello("Germany"); // call the method with an argument of "Germany"
            sayHello("Italy"); // call the method with an argument of "Italy"
            sayHello("Spain"); // call the method with an argument of "Spain"
            sayHello("Japan"); // call the method with an argument of "Japan"
        }
    }
