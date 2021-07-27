package OfficeHours.Practice_03_29_2021;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "elephant";
        //elephant
        //01234567    length = 8/2=4
        int letter = word.length()/2;
        if (word.length()%2==1){
            //if this word is odd
            //dog
            //012      length=3   3/2=1
            //System.out.println(word.charAt(letter));
            System.out.println(word.substring(letter, letter+1));

        } else {
            System.out.println(word.charAt(letter-1) + "" +word.charAt(letter));
            System.out.println(word.substring((letter-1),letter+1));
        }

    }
}
