package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class MaxNumbersFrom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;

        for(int i =0;i<5;i++){
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if(number>max){
                max = number;

            }

        }
        System.out.println(max);

    }
}
