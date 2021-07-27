package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class MinNumbersFrom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number");
        int first = scan.nextInt();
        int min = first;
        for (int i = 0; i < 4; i++) {
            System.out.println("Give me a number");
            int number = scan.nextInt();
            if (number < min) {
                min = number;

            }
            }
        System.out.println(min);
        }

    }