package day41_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List <String> shoppinglist = new ArrayList<>();
        System.out.println("size = " + shoppinglist.size());
        System.out.println("is empty? " + shoppinglist.isEmpty());

        if(shoppinglist.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }

        shoppinglist.add("shoes");
        shoppinglist.add("cheap monitor");
        shoppinglist.add("mask");
        shoppinglist.add("wooden spoon");
        shoppinglist.add("scooter");
        shoppinglist.add("java book");
        shoppinglist.add("tesla");

        if(shoppinglist.isEmpty()){
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("List is not empty, code java then go to mall");
        }


        int count = shoppinglist.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppinglist.contains("shoes"));

        if(shoppinglist.contains("shoes")) {
            System.out.println("Shoes is not in the list");
        } else {
            System.out.println("Shoes is not in the list");


        }
        System.out.println("Buying shoes ....   $80");

        shoppinglist.remove("shoes");
        System.out.println(shoppinglist);


        System.out.println("Done shopping, get back to coding");
        shoppinglist.clear();
        System.out.println(shoppinglist);
    }
}
