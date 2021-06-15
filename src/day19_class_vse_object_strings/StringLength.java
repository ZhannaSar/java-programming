package day19_class_vse_object_strings;

public class StringLength {
    public static void main(String[] args){
        String name = "Zhanna";
        System.out.println(name.length());
        String word ="java";
        System.out.println(word.length());
        System.out.println("count = " + word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Zhanna";
        System.out.println(firstName + " - " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";

        if (password.length() >= 6){
            System.out.println("valid amazon password");

        } else {
            System.out.println("password is too short");
        }

    }
}
