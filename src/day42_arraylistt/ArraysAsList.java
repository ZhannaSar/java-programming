package day42_arraylistt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54);
        System.out.println("nums = " + nums);
        //nums.add(100);
        //nums.remove(0);


        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer((23)));
        System.out.println("numsList = " + numsList);


        /**
         List String drinksWithCaffeine ->
         */
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        int coffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                coffeineAmount = 150;
                System.out.println(drink + " --> " + coffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                coffeineAmount = 112;
                System.out.println(drink + " --> " + coffeineAmount);
            } else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")) {
                coffeineAmount = 35;
                System.out.println(drink + " --> " + coffeineAmount);
            }

        }

        for (String drink: drinksWithCaffeine) {
            switch (drink){
                case "monster": case "red bull" : case "celsius":
                    coffeineAmount = 150;
                    System.out.println(drink + " --> " + coffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    coffeineAmount = 112;
                    System.out.println(drink + " --> " + coffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi": case "mdew":
                    coffeineAmount = 35;
                    System.out.println(drink + " --> " + coffeineAmount);




            }

        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
        drinksWithCaffeine.forEach(drink -> {
                    System.out.println("This is forEach block");
                });

    }
}
