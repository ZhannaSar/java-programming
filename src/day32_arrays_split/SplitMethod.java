package day32_arrays_split;

import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);

        String sentence = "today I am coding java arrays";
        String[] wordInSentence = sentence.split(" ");
        System.out.println(Arrays.toString(wordInSentence));
        System.out.println("wordInSentence.length = " + wordInSentence.length);
        System.out.println(wordInSentence[0]);
        System.out.println(sentence.split(" ")[0]);

        for(String each : wordInSentence) {
            System.out.println(each);
        }
    }
}
