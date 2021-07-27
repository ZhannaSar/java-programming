package mysolvings.java_interview_questions.Animal;
import java.util.*;
public class Alphabet {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeeeeeee";
        String longestSubstring= "";
        String temp = "";
        for(int i=0; i< str.length()-1; i++) {
            temp += str.charAt(i);
           if(str.charAt(i) != str.charAt(i+ 1) || i== str.length()-2){
               if(i== str.length()-2 && str.charAt(i) == str.charAt(i+ 1)){
                   temp += str.charAt(i+1);
               }}
           }if(temp.length() > longestSubstring.length()) {
            longestSubstring= temp;
        }
        temp = "";

    }
}
