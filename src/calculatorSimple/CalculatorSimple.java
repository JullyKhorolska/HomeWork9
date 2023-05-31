package calculatorSimple;

public class CalculatorSimple {
    public static void sum (double a, double b){

        System.out.println("Sum: " + a + " + " + b + " = " + (a + b));
    }
    public static void subtraction (double a, double b){
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));

    }
    public static void division (int a, int b) {
        try {
            System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("We can't divide " + e.getMessage());
        }
    }

    public static void multiplication (double a, double b){
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
    }

}
