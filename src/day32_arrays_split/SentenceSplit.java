package day32_arrays_split;

import java.util.*;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        for(String each:words){
            System.out.println(each);
        }


        String googleResult = "About 1,810,000 results (0.68 seconds)";
        
    }
}
