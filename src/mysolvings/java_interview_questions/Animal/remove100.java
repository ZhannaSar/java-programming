package mysolvings.java_interview_questions.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class remove100 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        ArrayList <Integer> list2 = new ArrayList<>();
        for(int each:list1){
            if(each<100){
                list2.add(each);
            }
        }
        System.out.println(list2);

    }
}
