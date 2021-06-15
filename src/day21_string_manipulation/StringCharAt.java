package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(2));
        System.out.println(word + "-" + word.length());

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(1));
        char first = company.charAt(0);
        char second = company.charAt(1);
        System.out.println(first);
    }
}
