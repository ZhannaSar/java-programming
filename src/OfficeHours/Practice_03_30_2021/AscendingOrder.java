package OfficeHours.Practice_03_30_2021;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        System.out.println("uppercase or lowercase?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        if (answer.equals("uppercase")) {
            for (int i = 'Z'; i >= 'A'; i--) {
                System.out.println((char) i + " ");
            }
        } else {
            for (int i = 'z'; i >= 'a'; i--) {
                System.out.println((char) i + " ");
            }

        }
    }
}