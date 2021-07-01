package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if( first == last){
            System.out.println("first and last letters are match");

        } else {
            System.out.println("first and last letter mismatch");
        }

        if(word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letters match");

        } else {

            System.out.println("first and last letters mismatch");
        }

        String friend = "aziza";
        System.out.println(friend.length());
        char firstletter = friend.charAt(0);
        char lastletter = friend.charAt(friend.length() - 1);
        System.out.println(firstletter);
        System.out.println(lastletter);
    }
}
