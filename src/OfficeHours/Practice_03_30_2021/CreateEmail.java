package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class CreateEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = input.nextLine();
        String wordtwo = input.nextLine();
        String email = "";

        if (wordOne.length() >= 6 && wordtwo.length() >= 6) {
            email = wordOne.substring(0,4);
            email +=wordtwo.substring(wordtwo.length() - 3);
            email += "@cybertek";
            System.out.println("email = " + email);
        } else {
            System.out.println("Invalid data");
        }
    }
}
