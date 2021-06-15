package day29_nestedloop_arrays;

public class nested_loops_arrays {
    public static void main(String[] args) {
        String word = "java";
        for (int i= 0; i < word.length() ; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }


        for (int outer = 0; outer < word.length(); outer++) {
            for(int inner = outer; inner < word.length(); inner++) {
                System.out.print(word.charAt(inner));
            }
            System.out.println();
        }





    }
}
