package day19_class_vse_object_strings;

public class StringComparison {
    public static void main(String[] args){
        String city = "Chicago";
        //EQUALS() method - case sensitive
        System.out.println(city.equals("Chicago")); // true
        System.out.println(city.equals("chicago")); // false
        System.out.println(city.equals("Chicago ")); // false

        //EQUALSIGNORECASE() method - CASE INSENSITIVE COMPARISON
        System.out.println(city.equalsIgnoreCase("chicago")); //true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //true
        System.out.println(city.equalsIgnoreCase("Chicago "));//false
        System.out.println(city.equalsIgnoreCase("Chi cago")); //false

        if(city.equals("Chicago")){
            System.out.println("equals() true");

        } else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("CHIcago")){
            System.out.println("equalsIgnoreCase() true");

        } else {
            System.out.println("equalsIgnoreCase() false");
        }


    }
}
