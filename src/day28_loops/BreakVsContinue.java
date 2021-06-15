package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        for (int n =1; n <= 5 ; n++) {
            System.out.print(n);
            if (n==3 ) {
              break;
            }

        }
    }
}
