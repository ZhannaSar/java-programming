package day09_scanner_practice;
import java.util.Scanner;


public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = 40*hourlyRate;
        System.out.println("Weekly pay is: " + weeklyPay + "$");
        double monthlyPay = (weeklyPay * 52 / 12);
        System.out.println("Monthly pay is: " + monthlyPay + "$");
        double annualPay = (12 * monthlyPay);
        System.out.println("Annual pay is: " + annualPay + "$");



    }
}
