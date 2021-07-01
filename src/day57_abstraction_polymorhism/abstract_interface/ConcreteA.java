package day57_abstraction_polymorhism.abstract_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB(){
        System.out.println("methodB Overriding version called");
    }

    public static void staticMethodC(){
        System.out.println("Static method hidden version is called");
    }

    @Override
    public void absMethodB(int num) {
        System.out.println("AbsMethodD overridden version is called");
    }
}
