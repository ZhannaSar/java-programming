package mysolvings.java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class Array__Sort_Ascending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }


            }}

        System.out.println(list);
    }
}