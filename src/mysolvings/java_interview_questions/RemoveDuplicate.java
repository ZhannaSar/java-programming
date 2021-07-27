package mysolvings.java_interview_questions;

import java.util.Arrays;

public class RemoveDuplicate {
      /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */
      public static void main(String[] args) {
          String word = "Zhanna beauty queen";
          String [] words = word.split(" ");
          String reverse = "";
          for(int i = words[1].length(); i >= 0; i--){
              reverse += words[1].charAt(i);
          }
          words[1] = reverse;
          String result = "";

          for(String each:words){
              result += each + "";
          }

      }

    }

