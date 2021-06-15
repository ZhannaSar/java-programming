package day49_static;

public class StaticTest {

    static String word = "java";
    public static void main(String[] args) {
        //static method can be called using classname
        StaticMethods.displayMessage("Wooden spoon");
        //instance method needs an object to be called
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        System.out.println(word);
    }
}
