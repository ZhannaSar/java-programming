package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <=5; i++){
            System.out.println("i = " + i);
            sum += i;

        }
        System.out.println("sum = " + sum);
    }
}
