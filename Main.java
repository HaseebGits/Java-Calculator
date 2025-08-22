import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator();

        System.out.println("Enter first number:");
        double a = scanner.nextDouble();
        System.out.println("Enter Second number:");
        double b = scanner.nextDouble();

        System.out.println("Select operation =,-,*,/");
        String operation= scanner.next();

        double result;
try {
    switch (operation) {
        case "+":
            result = calculator.addition(a, b);
            break;
        case "-":
            result = calculator.subtraction(a, b);
            break;
        case "*":
            result = calculator.multiply(a, b);
            break;
        case "/":
            result = calculator.divide(a, b);
            break;
        default:
            System.out.println("Invalid operation");
            return;
    }
    System.out.println("Result is:" + result);
} catch (Exception e) {
    System.out.println("Error:" + e.getMessage());
}
        scanner.close();
    }
}
