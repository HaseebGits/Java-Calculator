import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        runCalculator();
    }

    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        try {
            System.out.println("Enter first number:");
            double a = scanner.nextDouble();

            System.out.println("Enter second number:");
            double b = scanner.nextDouble();

            System.out.println("Select operation (+, -, *, /):");
            String operation = scanner.next();

            double result = performOperation(calculator, a, b, operation);
            System.out.println("Result is: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }

    public static double performOperation(Calculator calculator, double a, double b, String operation) {
        switch (operation) {
            case "+":
                return calculator.addition(a, b);
            case "-":
                return calculator.subtraction(a, b);
            case "*":
                return calculator.multiply(a, b);
            case "/":
                return calculator.divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
