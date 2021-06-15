package OfficeHours.Practice_05_05_2021;

import java.util.*;

public class ReverseOnlyLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec("Ab,c,de!$"));


    }

    public static String reverseNoSpec(String str) {
        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));

        for (int i = 0; i <= letters.length / 2; i++) {

        if(Character.isLetter(letters[i])){

        }
        }

        return null;
    }
}