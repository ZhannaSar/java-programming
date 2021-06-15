package OfficeHours.Practice_03_10_2021;

import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Next the length of the movie");
        double movieLength = input.nextDouble();
        double price = 0;

        if (movieLength == 1){
            price = 8.99;
            System.out.println("Price = " + price);
            //=assignment
            // ==compare

        } if (movieLength == 1.5){
            price = 10.50;
            System.out.println("Price = " + price);

        } if(movieLength == 2){
            price = 12.99;
            System.out.println("Price = " + price);

        } if(movieLength >=3){
            System.out.println("Price = " + 15.99);
        }

    }
}
