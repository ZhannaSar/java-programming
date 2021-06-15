package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" ##### F to C CONVERTER PROGRAM #####");
        System.out.println("Please enter Fahrenheit: ");
        double fahrenheitValue = scan.nextDouble();
        double FahToCelsius = (fahrenheitValue - 32) * 5 / 9;
        System.out.println("Fahrenheit to Celsius: " + FahToCelsius);
    }
}
