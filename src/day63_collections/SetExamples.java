package day63_collections;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(1);
        set.add(450);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(200);
        System.out.println(set);


        Set <String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");
        System.out.println(words);

        for(String string:words){
            System.out.println(string);
        }
        //convert you set to a list
        List<String> wordsList= new ArrayList<>(words);
        wordsList.add("world");
        System.out.println(wordsList);

        Set <String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("%7");
        linkedHashSet.add("java");
        linkedHashSet.add("cucumber");
        linkedHashSet.add("56");
        linkedHashSet.add("21");
        System.out.println(linkedHashSet);

        Set <String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("%7");
        treeSet.add("java");
        treeSet.add("cucumber");
        treeSet.add("56");
        treeSet.add("21");
        System.out.println(treeSet);
    }
}
