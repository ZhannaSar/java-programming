package day57_abstraction_polymorhism.abstract_interface;

public interface InterfaceA {
    public static final String TYPE = "interface";
    double MAXCOUNT = 564.8;

    public abstract void absMethodB(int num);

    public static void staticMethodE(String str){
        System.out.println("StaticMethodE is called with str" + str);
    }

    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }
}
