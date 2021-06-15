package OfficeHours.Practice_03_09_2021;

import java.util.Scanner;

public class SecondsConvertor {
    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds");
        inputSeconds = scan.nextInt();
        System.out.println("Enter hours");
        hours = scan.nextInt();
        System.out.println("Enter minutes");
        minutes = scan.nextInt();
        System.out.println("Enter seconds");
        seconds = scan.nextInt();
        hours = inputSeconds / 3600;
        inputSeconds %= 3600;
        minutes = inputSeconds / 60;
        inputSeconds %= 60;
    }
}