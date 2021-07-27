package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase");
        String upperOrLower = input.next();
        int starting;
        int ending;

        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
            for (int i = 'A'; i <= 'Z'; i++) {
                System.out.println((char) i + " ");
            }

        } else {
            starting = 'a';
            ending = 'z';

            for (int i = starting; i <= ending; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}