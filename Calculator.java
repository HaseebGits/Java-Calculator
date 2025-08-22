public class Calculator {
    public double addition(double a, double b){
        return a+b;
    }
    public double subtraction(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if( b==0)throw new ArithmeticException("Cannot divide by zero");
        return a/b;
    }
}
