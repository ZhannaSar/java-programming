package mysolvings.java_interview_questions;

public class Reverse {
    public static void main(String[] args) {

        String word= "ABCD";
        String reverse = "";

            for (int i = word.length() - 1; i >= 0; i--)

                reverse += word.toCharArray()[i];


        System.out.println(reverse);

        }
    }
