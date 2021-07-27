package day61_exceptions_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverflowError
        try {
            myMethod();
        }catch(StackOverflowError error) {
                System.out.println("StackOverflow error happened");
        }
        System.out.println("After error");

        List<Integer> nums = new ArrayList<>();
        while(true){
            nums.add(130);
        }
    }
    static int counter = 0;

    public static void myMethod(){
        System.out.println(counter++);
        myMethod();
    }
}
