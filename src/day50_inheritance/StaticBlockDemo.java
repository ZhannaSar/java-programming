package day50_inheritance;

import java.util.*;

public class StaticBlockDemo {
   public static class inner {

    }
    static  int num;
    static List <String> carModels;
    static{
        System.out.println("static initializer block");
        num=10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Tesla", "Audi", "BMW"));
    }

    {
        System.out.println("Initializer block");

    }

    public StaticBlockDemo(){
        System.out.println("Constructor method");
        num +=5;
    }

    public StaticBlockDemo(int value){
        System.out.println("Overloaded constractor - value = " + value);
        num +=value;
    }
}
