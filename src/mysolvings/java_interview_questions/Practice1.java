package mysolvings.java_interview_questions;

import java.util.Scanner;

public class Practice1 {
    //Write aprogram that will ask‘upper’ or ‘lower’•
    // Ifitisupper:printthe alphabet in all uppercase letter from A to Z•
    // If it is lower: print the alphabet in all uppercase letter from a to z
    public static void main(String[] args) {
        char starting;
        char ending;
        System.out.println("ask‘upper’ or ‘lower’");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        System.out.println("ascending or descending");
        String answer1 = scan.next();
        if (answer.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';
        } else {
            starting = 'a';
            ending = 'z';
        }
        if (answer1.equals("ascending")) {
            for (int i = starting; i <= ending; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i + " ");
            }
        }

    }

}