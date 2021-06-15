package day11_comparison_operators;

import java.util.Scanner;

public class AmazonFreeSheeping {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25.0){
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $" + totalPrice);
        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total: $ ");
        }
        System.out.println("THANKS FOR SHOPPING WITH US");

    }
}
