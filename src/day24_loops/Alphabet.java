package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
      char start = 'a';
      while (start <= 'z') {
            System.out.print(start + " ");
            start++;
        }

        System.out.println();
        char end = 'z';
        while (end >= 'a') {
            System.out.print(end + " ");
            end--;
        }
    }
}
