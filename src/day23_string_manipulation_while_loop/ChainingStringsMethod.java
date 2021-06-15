package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringsMethod {
    public static void main(String[] args) {
        String word = "wood  en spo  on";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ", "").toUpperCase());


        String city = "kABUL";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());

    }
}
