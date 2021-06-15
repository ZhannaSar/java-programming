package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String [] args){
        int score = 65;
        if(score >=90){
            System.out.println("D");

        } else if (score>=60 && score <90){
            System.out.println("B");

        }else if (score >= 40 && score < 60) {
            System.out.println("C");

        } else {
            System.out.println("D");
        }
    }
}
