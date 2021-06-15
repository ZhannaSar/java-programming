package day19_class_vse_object_strings;

public class StringStartEndWith {
    public static void main(String[] args){
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println("intellij idea");

        String name = "Irina";
        if(name.endsWith("a")){
            System.out.println("Maybe, it is a female name");


            String firstName = "Mrs. Sarsenova";
            if (firstName.startsWith("Dr.")){
                System.out.println("Soctor");

            }else if (firstName.startsWith("Mrs.")){
                System.out.println("Married woman");

            } else if (firstName.startsWith("Mr.")){
                System.out.println("Man");
            }
        }

    }
}
