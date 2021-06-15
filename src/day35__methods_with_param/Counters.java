package day35__methods_with_param;

public class Counters {
    public static void main(String[] args) {
        Count(5);
        Count(9);
        printAge(1993);
    }
    public static void Count(int num){
        for (int i = 0; i <= num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        System.out.println("Age: " + (2021 - year));
    }
}
