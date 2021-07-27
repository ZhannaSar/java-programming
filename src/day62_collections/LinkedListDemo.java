package day62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        List <Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(5);
        System.out.println(scores);
        System.out.println(scores.get(0));


    }
}
