package day35__methods_with_param;


public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(2);
        int count = 55;
        displayValue(count);
        greetByName("Zhanna");
        String name = "Inna";
        greetByName(name);
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }


    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }
}
