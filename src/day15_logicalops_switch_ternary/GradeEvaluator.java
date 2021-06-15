package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("Passed with grade " + grade);

        } else if (grade == 'D') {
            System.out.println("Qualify for retake with grade " + grade);

        } else if (grade == 'E') {
            System.out.println("Fail. Grade - " + grade);

        } else {
            System.out.println("invalid grade " + grade);

        }
    }
}
