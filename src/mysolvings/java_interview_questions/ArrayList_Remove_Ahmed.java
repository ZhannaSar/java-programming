package mysolvings.java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Remove_Ahmed {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

   //     for(int i=0; i < names.size(); i++){
        //       if (names.get(i).contains("Ahmed")){
         //       names.remove("Ahmed");
          //  }
       // }
      //  System.out.println(names.toString());

        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

    }
}
