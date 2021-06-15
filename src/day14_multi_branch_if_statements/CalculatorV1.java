package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args){
        double num3 = 5.5;
        double num4 = 2.5;
       char operator = '-';

        if (operator == '+') {
            System.out.println(num3 + num4);

        } else if (operator == '-'){
            System.out.println(num3 - num4);

        } else if (operator == '*'){
            System.out.println(num3*num4);

        } else if(operator == '/'){
            System.out.println(num3/num4);

        } else {
            System.out.println("Invalid operator - " + operator);
        }
    }
}
