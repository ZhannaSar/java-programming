package mysolvings.java_interview_questions;

public class Reversejanna {
    public static void main(String[] args) {
        //firstDuplicate
        int[] array = {4, 6, 7, 4, 6, 8, 9};
        int duplicate = 0;
        for(int each: array){
            int frequency = 0;
            for(int each1:array){
                if(each==each1)
                    frequency++;
            }
            if(frequency>1){
                duplicate=each;
            }
        }
        System.out.println(duplicate);
        }
    }

