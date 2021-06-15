package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2 , 20.0));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);

        System.out.println(minus(10, 3));
        
    }
    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
    public static double multiple(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide (double num1, double num2) {
        double result = num1/num2;
        return result;
    }
    
    
}
