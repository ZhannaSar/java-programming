package day19_class_vse_object_strings;

import javax.lang.model.SourceVersion;
import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args){
        String word = "CyberTek";
        String sentence = "Java Is Fun!";
        System.out.println(word.toLowerCase());
        System.out.println("Java".toLowerCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);


        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable "Amazon" to "AMAZON"

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("11 = " + 11);

    }
}
