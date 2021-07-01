package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLongestFromArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words will you enter?");
        String [] words = new String[scan.nextInt()];
        scan.nextLine();

        for(int i = 0; i < words.length; i++){
            System.out.println("Enter word: " + (i+1));
            words[i] = scan.nextLine();
        }
    }
}
